import java.util.Iterator;
import androidx.constraintlayout.widget.ConstraintLayout$a;
import java.util.Collection;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.lang.reflect.Constructor;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqe
{
    public static HashMap<String, Constructor<? extends zpe>> b;
    public HashMap<Integer, ArrayList<zpe>> a;
    
    static {
        final HashMap<String, Constructor<? extends zpe>> hashMap = lqe.b = new HashMap<String, Constructor<? extends zpe>>();
        try {
            hashMap.put("KeyAttribute", (Constructor<? extends zpe>)aqe.class.getConstructor((Class<?>[])new Class[0]));
            lqe.b.put("KeyPosition", (Constructor<? extends zpe>)are.class.getConstructor((Class<?>[])new Class[0]));
            lqe.b.put("KeyCycle", dqe.class.getConstructor((Class<?>[])new Class[0]));
            lqe.b.put("KeyTimeCycle", cre.class.getConstructor((Class<?>[])new Class[0]));
            lqe.b.put("KeyTrigger", (Constructor<? extends zpe>)fre.class.getConstructor((Class<?>[])new Class[0]));
        }
        catch (final NoSuchMethodException ex) {
            Log.e("KeyFrames", "unable to load", (Throwable)ex);
        }
    }
    
    public lqe() {
        this.a = new HashMap<Integer, ArrayList<zpe>>();
    }
    
    public lqe(final Context context, final XmlPullParser xmlPullParser) {
        this.a = new HashMap<Integer, ArrayList<zpe>>();
        try {
            int i = xmlPullParser.getEventType();
            Object o = null;
            while (i != 1) {
                Object o2 = null;
                if (i != 2) {
                    if (i != 3) {
                        o2 = o;
                    }
                    else {
                        o2 = o;
                        if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                            return;
                        }
                    }
                }
                else {
                    final String name = xmlPullParser.getName();
                    if (lqe.b.containsKey(name)) {
                        Label_0221: {
                            Label_0211: {
                                try {
                                    o2 = lqe.b.get(name);
                                    if (o2 != null) {
                                        o2 = ((Constructor<zpe>)o2).newInstance(new Object[0]);
                                        try {
                                            ((zpe)o2).e(context, Xml.asAttributeSet(xmlPullParser));
                                            this.b((zpe)o2);
                                            o = o2;
                                            break Label_0221;
                                        }
                                        catch (final Exception ex) {
                                            o = o2;
                                            o2 = ex;
                                            break Label_0211;
                                        }
                                    }
                                    o2 = new(java.lang.NullPointerException.class)();
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Keymaker for ");
                                    sb.append(name);
                                    sb.append(" not found");
                                    new NullPointerException(sb.toString());
                                    throw o2;
                                }
                                catch (final Exception ex2) {}
                            }
                            Log.e("KeyFrames", "unable to create ", (Throwable)o2);
                        }
                        o2 = o;
                    }
                    else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if ((o2 = o) != null) {
                            final HashMap<String, lj6> d = ((zpe)o).d;
                            o2 = o;
                            if (d != null) {
                                lj6.d(context, xmlPullParser, d);
                                o2 = o;
                            }
                        }
                    }
                    else {
                        o2 = o;
                        if (name.equalsIgnoreCase("CustomMethod") && (o2 = o) != null) {
                            final HashMap<String, lj6> d2 = ((zpe)o).d;
                            o2 = o;
                            if (d2 != null) {
                                lj6.d(context, xmlPullParser, d2);
                                o2 = o;
                            }
                        }
                    }
                }
                i = xmlPullParser.next();
                o = o2;
            }
        }
        catch (final IOException ex3) {
            ex3.printStackTrace();
        }
        catch (final XmlPullParserException ex4) {
            ex4.printStackTrace();
        }
    }
    
    public final void a(final mrh mrh) {
        final ArrayList list = this.a.get(mrh.c);
        if (list != null) {
            mrh.w.addAll(list);
        }
        final ArrayList list2 = this.a.get(-1);
        if (list2 != null) {
            for (final zpe zpe : list2) {
                final String y = ((ConstraintLayout$a)mrh.b.getLayoutParams()).Y;
                final String c = zpe.c;
                if (c != null && y != null && y.matches(c)) {
                    mrh.w.add(zpe);
                }
            }
        }
    }
    
    public final void b(final zpe zpe) {
        if (!this.a.containsKey(zpe.b)) {
            this.a.put(zpe.b, new ArrayList<zpe>());
        }
        final ArrayList list = this.a.get(zpe.b);
        if (list != null) {
            list.add(zpe);
        }
    }
}
