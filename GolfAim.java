import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.AWTException;
import java.awt.MouseInfo;

public class GolfAim implements NativeKeyListener
{

    private Robot r;

    public void nativeKeyPressed(NativeKeyEvent e)
    {

        boolean isAlt = (e.getModifiers() & NativeKeyEvent.ALT_MASK) != 0;

        if (isAlt && e.getKeyCode() == NativeKeyEvent.VC_QUOTE)
        {
            r.mouseMove(MouseInfo.getPointerInfo().getLocation().x + 1, MouseInfo.getPointerInfo().getLocation().y);
        }

        else if (isAlt && e.getKeyCode() == NativeKeyEvent.VC_SEMICOLON)
        {
            r.mouseMove(MouseInfo.getPointerInfo().getLocation().x - 1, MouseInfo.getPointerInfo().getLocation().y);
        }

        else if (isAlt && e.getKeyCode() == NativeKeyEvent.VC_OPEN_BRACKET)
        {
            r.mouseMove(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y - 1);
        }

        else if (isAlt && e.getKeyCode() == NativeKeyEvent.VC_SLASH)
        {
            r.mouseMove(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y + 1);
        }

        else if (isAlt && e.getKeyCode() == NativeKeyEvent.VC_A)
        {
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }
    }

    public void setRobot(Robot r)
    {
        this.r = r;
    }

    public static void main(String[] args)
    {

        GolfAim aimer = new GolfAim();

        try 
        {
            aimer.setRobot(new Robot());
        }
        catch (AWTException e)
        {

        }

        try 
        {
            GlobalScreen.registerNativeHook();
        }
        catch (NativeHookException ex)
        {

        }
        
        GlobalScreen.addNativeKeyListener(aimer);

    }
}
