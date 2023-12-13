import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class UserInterface extends Frame {
    public UserInterface(String title){
        super(title);
        setBounds(200,200,300,700);
        Button b=new Button("clic");
        TextArea t=new TextArea("ecrire",100,100);
        add(b,BorderLayout.CENTER);
        add(t,BorderLayout.NORTH);
        b.addActionListener(null);
        add(b);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                System.exit(0);

            }

        });

    }
}
