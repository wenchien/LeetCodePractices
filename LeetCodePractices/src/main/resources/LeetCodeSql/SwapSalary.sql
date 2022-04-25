--Write an SQL query to swap all 'f' and 'm' values
--(i.e., change all 'f' values to 'm' and vice versa) with a single update statement and no intermediate temporary tables.
# Write your MySQL query statement below
update salary set sex = IF (sex = "m", "f", "m");
-- if(condition, result if true, result if false)