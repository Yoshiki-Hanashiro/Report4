public class Report4 {
    public static void main(String[] args){
        try {
            String str = null;
            if(str == null){
                throw new NullPointerException("値がnullになっています。");
            }
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("例外が発生しました。");
            System.out.println(e.getMessage());
        }
    }
}
