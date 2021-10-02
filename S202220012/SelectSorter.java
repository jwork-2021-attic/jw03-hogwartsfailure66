package S202220012;

import example.Sorter;

public class SelectSorter implements Sorter {
    private int[] a;
    private String plan = "";

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
//        plan += "" + i + "<->" + j + "\n";
    }

    @Override
    public void sort() {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            int min = a[i];
            int minPos = i;
            for (int j = 1; j < len - i; j++) {
                if (a[i + j] < min) {
                    min = a[i + j];
                    minPos = i + j;
                }
            }
            swap(i, minPos);
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }
}
