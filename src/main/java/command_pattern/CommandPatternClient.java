package command_pattern;


import java.net.URI;

public class CommandPatternClient {
	
	
	public static void main(String[] args) {
        Document doc = new Document();
//        try {
//                URI abc = new URI("abc");
//                System.out.println(URI.class.getSuperclass().getSimpleName());
//        }catch (Exception e) {
//                e.printStackTrace();
//        }
        
        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();
       
        
    }

}
