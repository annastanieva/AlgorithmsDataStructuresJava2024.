# Гра "Вгадай слово"

## Опис
"Вгадай слово" — це гра, в якій комп'ютер випадково загадує слово, а гравець намагається його вгадати, вводячи літери. Після кожної спроби комп'ютер вказує, які літери вгадані правильно та стоять на правильних місцях.

## Правила гри
1. Комп'ютер обирає слово зі списку і відображає його у вигляді порожніх підказок (наприклад, `_ _ _ _ _` для слова з 5 букв).
2. Гравець вводить літери, намагаючись вгадати загадане слово.
3. Після кожної спроби комп'ютер:
   - Показує прогрес відгадування у форматі, де відображені вгадані літери.
   - Повідомляє, якщо літери є у слові, але стоять на неправильних місцях.
4. Гра триває, поки:
   - Гравець не відгадає слово повністю.
   - Гравець не вичерпає максимальну кількість спроб (за замовчуванням - 10).
5. Якщо гравець не вгадує букву за кілька спроб, надається підказка.

## Вимоги
- **Java 11** або новіша версія.
- Розробка ведеться у консольному середовищі, введення користувача — через командний рядок.

## Інструкція з використання
1. Завантажте та скомпілюйте код: `javac GuessTheWordGame.java`.
2. Запустіть гру: `java GuessTheWordGame`.
3. Дотримуйтесь інструкцій, що з'являються у консолі.
4. Введіть літеру, яку хочете вгадати, та натисніть Enter.
5. Гра завершиться автоматично після вгадування слова або після закінчення спроб.

## Дизайн гри
Гра має модульний дизайн:
- `GameEngine`: логіка обробки введення літер, перевірка позицій, контроль за спробами.
- `WordGenerator`: вибір випадкового слова зі списку слів.
- `UserInterface`: введення та виведення інформації у консоль.
