package examples.mockito;

import org.mockito.Mockito;

import java.util.List;

public class _00_simple_mock {
    public static void main(String[] args) {
        List<String> list = Mockito.mock(List.class);
        System.out.println(list.add("A"));
        System.out.println(list.get(-1));
        System.out.println(list.size());
        System.out.println(list.iterator());

        System.out.println(list.getClass().getName());
    }
}
