package parkhyeryn;

abstract class PairMap{
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dic extends PairMap{
    int number; 
    
    public Dic(int i) { 
        keyArray = new String[i];
        valueArray = new String[i];
        this.number = i;
    }

    @Override
    String get(String key) {
        for(int i = 0; i<number;i++) {
            if(key.equals(keyArray[i])) {
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        for(int i = 0; i<number; i++) {
            if(key.equals(keyArray[i])) {
                valueArray[i] = value;
                break;
            }
            else if(keyArray[i]==null){
                keyArray[i] = key;
                valueArray[i] = value;
                break;
            }
        }
    }

    @Override
    String delete(String key) {
        String re = "";
        int check = 0;
        for(int i = 0; i<number;i++) {
            if(key.equals(keyArray[i])) {
                re = keyArray[i];
                keyArray[i] = null;
                valueArray[i] = null;
            }
            else
                re = null;
        }
        return re;
    }

    @Override
    int length() { 
        int count = 0;
        for(int i = 0; i<number;i++) {
            if(keyArray[i]!=null) 
                count++;
        }
        return count;
    }
    
}

public class Dictionary {

    public static void main(String[] args) {
        Dic dic = new Dic(10);
        dic.put("������", "���̵���");
        dic.put("������", "���̵���");
        dic.put("������", "�󺣺�");
        System.out.println("�������� "+dic.get("������"));
        System.out.println("�����ִ� "+dic.get("������"));
        dic.delete("������");
        System.out.println("�����ִ� "+dic.get("������"));
    }

}
