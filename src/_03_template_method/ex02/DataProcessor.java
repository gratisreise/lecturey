package _03_template_method.ex02;

public abstract class DataProcessor {
    //탬플릿 메소드
    public final void process(String data) {
        loadData(data);
        if (isValidData(data)) {
            processData(data);
            saveData(data);
        } else {
            System.out.println("Data is invalid, processing aborted.");
        }
    }

    protected abstract void loadData(String data);
    protected abstract boolean isValidData(String data);
    protected abstract void processData(String data);
    protected abstract void saveData(String data);
}
