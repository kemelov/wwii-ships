
# WWII ships Java API

API для тестового задания на основе 48й задачи "Корабли" на сайте sql-ex.ru 





## Решить задачу в SQL-EX.RU под номером 48

select class from Ships s join Outcomes o on s.name = o.ship where o.result='sunk' union select class from Classes join Outcomes o on class = o.ship where result = 'sunk'
## Заполнить данные в таблицах через data.sql

INSERT INTO tb_classes(name, type, country, num_guns, bore, displacement)
VALUES
('Bismarck', 'bb', 'GERMANY', 8, 15.0, 42000),
('Iowa', 'bb', 'USA', 9, 16.0, 46000),
('Kongo', 'bc', 'JAPAN', 8, 14.0, 32000),
('North Carolina', 'bb', 'USA', 12, 16.0, 37000),
('Renown', 'bc', 'UNITED_KINGDOM', 6, 15.0, 32000),
('Revenge', 'bb', 'UNITED_KINGDOM', 8, 15.0, 29000),
('Tennessee', 'bb', 'USA', 12, 14.0, 32000),
('Yamato', 'bb', 'JAPAN', 9, 18.0, 65000);

INSERT INTO tb_ships (name, class, launch_year) VALUES
('California', 'Tennessee', '1921'),
('Haruna', 'Kongo', '1916'),
('Hiei', 'Kongo', '1914'),
('Iowa', 'Iowa', '1943'),
('Kirishima', 'Kongo', '1915'),
('Kongo', 'Kongo', '1913'),
('Missouri', 'Iowa', '1944'),
('Musashi', 'Yamato', '1942'),
('New Jersey', 'Iowa', '1943'),
('North Carolina', 'North Carolina', '1941'),
('Ramillies', 'Revenge', '1917'),
('Renown', 'Renown', '1916'),
('Repulse', 'Renown', '1916'),
('Resolution', 'Renown', '1916'),
('Revenge', 'Revenge', '1916'),
('Royal Oak', 'Revenge', '1916'),
('Royal Sovereign', 'Revenge', '1916'),
('South Dakota', 'North Carolina', '1941'),
('Tennessee', 'Tennessee', '1920'),
('Washington', 'North Carolina', '1941'),
('Wisconsin', 'Iowa', '1944'),
('Yamato', 'Yamato', '1941');

INSERT INTO tb_outcomes (ship, battle, result)
VALUES 
('Bismarck', 'North Atlantic', 'SUNK'),
('California', 'Guadalcanal', 'DAMAGED'),
('California', 'Surigao Strait', 'OK'),
('Duke of York', 'North Cape', 'OK'),
('Fuso', 'Surigao Strait', 'SUNK'),
('Hood', 'North Atlantic', 'SUNK'),
('King George V', 'North Atlantic', 'OK'),
('Kirishima', 'Guadalcanal', 'SUNK'),
('Prince of Wales', 'North Atlantic', 'DAMAGED'),
('Rodney', 'North Atlantic', 'OK'),
('Schamhorst', 'North Cape', 'SUNK'),
('South Dakota', 'Guadalcanal', 'DAMAGED'),
('Tennessee', 'Surigao Strait', 'OK'),
('Washington', 'Guadalcanal', 'OK'),
('West Virginia', 'Surigao Strait', 'OK'),
('Yamashiro', 'Surigao Strait', 'SUNK');
       
 
INSERT INTO tb_battles (name, date)
VALUES
('#Cuba62a', '1962-10-20'),
('#Cuba62b', '1962-10-25'),
('Guadalcanal', '1942-11-15'),
('North Atlantic', '1941-05-25'),
('North Cape', '1943-12-26'),
('Surigao Strait', '1944-10-25');
