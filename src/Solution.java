/* 
Задача №5 на преобразование целых типов
Расставьте правильно операторы приведения типа, чтобы получился ответ: c=256
int a = (byte)44;
int b = (byte)300;
short c = (byte)(b - a);


Требования:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран.
3. Метод main() должен содержать переменную a типа int.
4. Метод main() должен содержать переменную b типа int.
5. Метод main() должен содержать переменную c типа short.
6. Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
7. Программа должна выводить число 256.


public class Solution {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (byte) 300;
        short c = (byte) (b - a);
        System.out.println(c);
    }
}
*/

public class Solution {
    public static void main(String[] args) {
        int a = (int) 44;
        int b = (int) 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}