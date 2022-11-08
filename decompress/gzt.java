import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import android.view.InflateException;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.reflect.Constructor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzt
{
    public static final Class<?>[] b;
    public static final at0<String, Constructor<?>> c;
    public final Context a;
    
    static {
        b = new Class[] { Context.class, AttributeSet.class };
        c = new at0();
    }
    
    public gzt(final Context a) {
        this.a = a;
    }
    
    public final Object a(final AttributeSet set, final Class<?> clazz, final String s) {
        final String attributeValue = set.getAttributeValue((String)null, "class");
        if (attributeValue != null) {
            try {
                final at0<String, Constructor<?>> c = gzt.c;
                synchronized (c) {
                    Constructor constructor2;
                    final Constructor constructor = constructor2 = (Constructor)((l7q)c).getOrDefault((Object)attributeValue, (Object)null);
                    if (constructor == null) {
                        final Class<?> subclass = Class.forName(attributeValue, false, this.a.getClassLoader()).asSubclass(clazz);
                        constructor2 = constructor;
                        if (subclass != null) {
                            constructor2 = subclass.getConstructor(gzt.b);
                            constructor2.setAccessible(true);
                            ((l7q)c).put((Object)attributeValue, (Object)constructor2);
                        }
                    }
                    return constructor2.newInstance(this.a, set);
                }
            }
            catch (final Exception ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not instantiate ");
                sb.append(clazz);
                sb.append(" class ");
                sb.append(attributeValue);
                throw new InflateException(sb.toString(), (Throwable)ex);
            }
        }
        throw new InflateException(l7k.c(s, " tag must have a 'class' attribute"));
    }
    
    public final xyt b(final XmlPullParser xmlPullParser, final AttributeSet set, final xyt xyt) throws XmlPullParserException, IOException {
        final int depth = xmlPullParser.getDepth();
        tzt tzt;
        if (xyt instanceof tzt) {
            tzt = (tzt)xyt;
        }
        else {
            tzt = null;
        }
        Label_0911: {
        Label_0670:
            while (true) {
                Object o = null;
                Object o2;
                while (true) {
                    final int next = xmlPullParser.next();
                    if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                        return (xyt)o;
                    }
                    if (next != 2) {
                        continue;
                    }
                    final String name = xmlPullParser.getName();
                    if ("fade".equals(name)) {
                        o2 = new cra(this.a, set);
                    }
                    else if ("changeBounds".equals(name)) {
                        o2 = new yo3(this.a, set);
                    }
                    else if ("slide".equals(name)) {
                        o2 = new jeq(this.a, set);
                    }
                    else if ("explode".equals(name)) {
                        o2 = new lia(this.a, set);
                    }
                    else if ("changeImageTransform".equals(name)) {
                        o2 = new ep3(this.a, set);
                    }
                    else if ("changeTransform".equals(name)) {
                        o2 = new np3(this.a, set);
                    }
                    else if ("changeClipBounds".equals(name)) {
                        o2 = new zo3(this.a, set);
                    }
                    else if ("autoTransition".equals(name)) {
                        o2 = new e91(this.a, set);
                    }
                    else if ("changeScroll".equals(name)) {
                        o2 = new lp3(this.a, set);
                    }
                    else if ("transitionSet".equals(name)) {
                        o2 = new tzt(this.a, set);
                    }
                    else if ("transition".equals(name)) {
                        o2 = this.a(set, xyt.class, "transition");
                    }
                    else if ("targets".equals(name)) {
                        final int depth2 = xmlPullParser.getDepth();
                    Label_0639_Outer:
                        while (true) {
                            final int next2 = xmlPullParser.next();
                            if (next2 == 3) {
                                o2 = o;
                                if (xmlPullParser.getDepth() <= depth2) {
                                    break;
                                }
                            }
                            o2 = o;
                            if (next2 == 1) {
                                break;
                            }
                            if (next2 != 2) {
                                continue;
                            }
                            if (xmlPullParser.getName().equals("target")) {
                                final TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(set, xkr.a);
                                final int i = elv.i(obtainStyledAttributes, xmlPullParser, "targetId", 1);
                                while (true) {
                                    if (i != 0) {
                                        xyt.c(i);
                                        break Label_0639;
                                    }
                                    final int j = elv.i(obtainStyledAttributes, xmlPullParser, "excludeId", 2);
                                    if (j != 0) {
                                        xyt.r(j);
                                        break Label_0639;
                                    }
                                    o2 = elv.j(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                                    if (o2 != null) {
                                        xyt.f((String)o2);
                                        break Label_0639;
                                    }
                                    o2 = elv.j(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                    if (o2 != null) {
                                        xyt.u((String)o2);
                                        break Label_0639;
                                    }
                                    final String k = elv.j(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                    Label_0605: {
                                        if (k == null) {
                                            break Label_0605;
                                        }
                                        o2 = k;
                                        try {
                                            xyt.t((Class)Class.forName(k));
                                            obtainStyledAttributes.recycle();
                                            continue Label_0639_Outer;
                                            o2 = k;
                                            final String l = elv.j(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                            iftrue(Label_0639:)(l == null);
                                            o2 = l;
                                            xyt.e(Class.forName(l));
                                            continue;
                                        }
                                        catch (final ClassNotFoundException ex) {
                                            obtainStyledAttributes.recycle();
                                            throw new RuntimeException(l7k.c("Could not create ", (String)o2), ex);
                                        }
                                    }
                                    break;
                                }
                                break Label_0670;
                            }
                            break Label_0670;
                        }
                    }
                    else if ("arcMotion".equals(name)) {
                        if (xyt == null) {
                            throw new RuntimeException("Invalid use of arcMotion element");
                        }
                        xyt.M((qzj)new as0(this.a, set));
                        o2 = o;
                    }
                    else if ("pathMotion".equals(name)) {
                        if (xyt == null) {
                            throw new RuntimeException("Invalid use of pathMotion element");
                        }
                        xyt.M((qzj)this.a(set, qzj.class, "pathMotion"));
                        o2 = o;
                    }
                    else {
                        if (!"patternPathMotion".equals(name)) {
                            break Label_0911;
                        }
                        if (xyt == null) {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        xyt.M((qzj)new wzj(this.a, set));
                        o2 = o;
                    }
                    if ((o = o2) == null) {
                        continue;
                    }
                    if (!xmlPullParser.isEmptyElementTag()) {
                        this.b(xmlPullParser, set, (xyt)o2);
                    }
                    if (tzt != null) {
                        break;
                    }
                    if (xyt != null) {
                        throw new InflateException("Could not add transition to another transition.");
                    }
                    o = o2;
                }
                tzt.S((xyt)o2);
            }
            final StringBuilder g = w48.g("Unknown scene name: ");
            g.append(xmlPullParser.getName());
            throw new RuntimeException(g.toString());
        }
        final StringBuilder g2 = w48.g("Unknown scene name: ");
        g2.append(xmlPullParser.getName());
        throw new RuntimeException(g2.toString());
    }
}
