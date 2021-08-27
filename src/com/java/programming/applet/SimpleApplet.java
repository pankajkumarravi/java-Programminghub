package com.java.programming.applet;

/**
 * @Author pankaj
 * @create 8/27/21 9:17 AM
 */
import java.applet.*;
import java.awt.*;


//Following example demonstrates how to create a
//basic Applet by extrnding Applet Class.You will
//need to embed another HTML code to run this program.

class SimpleApplet extends Applet
{

    public void paint(Graphics g)
    {
        g.drawString("Hello Applet", 50, 30);
    }
}

//Now compile the above code and call the generated
//class in your HTML code as follows:
 /*  /*--------------------------
<HTML>
<HEAD>
</HEAD>
<BODY>
<div >
<APPLET CODE="SimpleApplet.class" WIDTH="600" HEIGHT="400">
</APPLET>
</div>
</BODY>
</HTML>
---------------------------*
  */