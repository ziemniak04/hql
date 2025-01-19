package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TestHQL {
    private static Session session;
    private static SessionFactory factory;

    // Method to obtain session
    private static Session getSession() {
        if (factory == null) {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Products.class)
                    .addAnnotatedClass(Categories.class)
                    .buildSessionFactory();
        }
        if (session == null || !session.isOpen()) {
            session = factory.getCurrentSession();
        }
        return session;
    }

    public static void main(String[] args) {
        // Initialize session
        session = getSession();

        try {
            // Start transaction
            session.beginTransaction();

            // a) Percentage of products with >50% sum of iron and calcium
            String hqlTotalCount = "SELECT COUNT(p.id) FROM Products p";
            Long totalCount = (Long) session.createQuery(hqlTotalCount).getSingleResult();

            String hqlConditionCount = "SELECT COUNT(p.id) FROM Products p WHERE (p.iron + p.calcium) > 50";
            Long conditionCount = (Long) session.createQuery(hqlConditionCount).getSingleResult();

            double percentage = (conditionCount * 100.0) / totalCount;
            System.out.printf("Percentage of foods with >50%% sum of iron and calcium: %.2f%%\n", percentage);

            // b) Average caloric value of products with "Bacon" in the name
            String hqlB = "SELECT AVG(p.calories) FROM Products p WHERE p.item LIKE '%Bacon%'";
            Double avgCalories = (Double) session.createQuery(hqlB).getSingleResult();
            System.out.printf("Average caloric value of products with 'Bacon': %.2f kcal\n", avgCalories);

            // c) Product with the highest cholesterol in each category
            String hqlC = "SELECT p.category, p.id, MAX(p.cholesterol) FROM Products p GROUP BY p.category";
            List<Object[]> resultsC = session.createQuery(hqlC).getResultList();
            for (Object[] row : resultsC) {
                System.out.printf("Category: %s, Product: %s, Cholesterol: %.2f mg\n", row[0], row[1], row[2]);
            }

            // d) Number of coffees without fiber
            String hqlD = "SELECT COUNT(p.id) FROM Products p WHERE (p.item LIKE '%Mocha%' OR p.item LIKE '%Coffee%') AND p.dietaryFiber = 0";
            Long countCoffees = (Long) session.createQuery(hqlD).getSingleResult();
            System.out.printf("Number of coffees without fiber: %d\n", countCoffees);

            // e) Caloric value of all McMuffins in kJ
            String hqlE = "SELECT p.id, (p.calories * 4184) AS kilojoules FROM Products p WHERE p.item LIKE '%McMuffin%' ORDER BY p.calories ASC";
            List<Object[]> mcMuffinResults = session.createQuery(hqlE).getResultList();
            for (Object[] row : mcMuffinResults) {
                System.out.printf("Product: %s, Calories in kJ: %.2f\n", row[0], row[1]);
            }

            // f) Number of distinct carbohydrate values
            String hqlF = "SELECT COUNT(DISTINCT p.carbohydrates) FROM Products p";
            Long distinctCarbs = (Long) session.createQuery(hqlF).getSingleResult();
            System.out.printf("Number of distinct carbohydrate values: %d\n", distinctCarbs);

            // Commit the transaction
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (session != null && session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
