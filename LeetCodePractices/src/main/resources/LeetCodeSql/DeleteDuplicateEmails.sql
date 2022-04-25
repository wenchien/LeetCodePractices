--Write an SQL query to delete all the duplicate emails, keeping only one unique email with the smallest id. Note that you are supposed to write a DELETE statement and not a SELECT one.
--Return the result table in any order.
--The query result format is in the following example.

delete p1 from Person p1, Person p2 where p1.email = p2.email and p1.id > p2.id