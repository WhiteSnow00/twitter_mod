import java.lang.reflect.Method;
import java.util.Iterator;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.Serializable;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lj6
{
    public boolean a;
    public String b;
    public int c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;
    
    public lj6(final String b, final int c, final Object o, final boolean a) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.f(o);
    }
    
    public lj6(final lj6 lj6, final Object o) {
        this.a = false;
        this.b = lj6.b;
        this.c = lj6.c;
        this.f(o);
    }
    
    public static void d(final Context context, final XmlPullParser xmlPullParser, final HashMap<String, lj6> hashMap) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), dnl.M0);
        final int indexCount = obtainStyledAttributes.getIndexCount();
        String s = null;
        Serializable s2 = null;
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < indexCount) {
            final int index = obtainStyledAttributes.getIndex(i);
            String s4 = null;
            Serializable s5 = null;
            int n3 = 0;
            int n4 = 0;
            Label_0502: {
                if (index == 0) {
                    final String s3 = s4 = obtainStyledAttributes.getString(index);
                    s5 = s2;
                    n3 = n;
                    n4 = n2;
                    if (s3 != null) {
                        s4 = s3;
                        s5 = s2;
                        n3 = n;
                        n4 = n2;
                        if (s3.length() > 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(Character.toUpperCase(s3.charAt(0)));
                            sb.append(s3.substring(1));
                            s4 = sb.toString();
                            s5 = s2;
                            n3 = n;
                            n4 = n2;
                        }
                    }
                }
                else if (index == 10) {
                    s4 = obtainStyledAttributes.getString(index);
                    n4 = 1;
                    s5 = s2;
                    n3 = n;
                }
                else if (index == 1) {
                    s5 = obtainStyledAttributes.getBoolean(index, false);
                    n3 = 6;
                    s4 = s;
                    n4 = n2;
                }
                else if (index == 3) {
                    s5 = obtainStyledAttributes.getColor(index, 0);
                    n3 = 3;
                    s4 = s;
                    n4 = n2;
                }
                else if (index == 2) {
                    s5 = obtainStyledAttributes.getColor(index, 0);
                    n3 = 4;
                    s4 = s;
                    n4 = n2;
                }
                else {
                    if (index == 7) {
                        s5 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    }
                    else if (index == 4) {
                        s5 = obtainStyledAttributes.getDimension(index, 0.0f);
                    }
                    else {
                        if (index == 5) {
                            s5 = obtainStyledAttributes.getFloat(index, Float.NaN);
                            n3 = 2;
                            s4 = s;
                            n4 = n2;
                            break Label_0502;
                        }
                        if (index == 6) {
                            s5 = obtainStyledAttributes.getInteger(index, -1);
                            n3 = 1;
                            s4 = s;
                            n4 = n2;
                            break Label_0502;
                        }
                        if (index == 9) {
                            s5 = obtainStyledAttributes.getString(index);
                            n3 = 5;
                            s4 = s;
                            n4 = n2;
                            break Label_0502;
                        }
                        s4 = s;
                        s5 = s2;
                        n3 = n;
                        n4 = n2;
                        if (index == 8) {
                            int n5;
                            if ((n5 = obtainStyledAttributes.getResourceId(index, -1)) == -1) {
                                n5 = obtainStyledAttributes.getInt(index, -1);
                            }
                            s5 = n5;
                            n3 = 8;
                            n4 = n2;
                            s4 = s;
                        }
                        break Label_0502;
                    }
                    n3 = 7;
                    s4 = s;
                    n4 = n2;
                }
            }
            ++i;
            s = s4;
            s2 = s5;
            n = n3;
            n2 = n4;
        }
        if (s != null && s2 != null) {
            hashMap.put(s, new lj6(s, n, s2, (boolean)(n2 != 0)));
        }
        obtainStyledAttributes.recycle();
    }
    
    public static void e(final View view, final HashMap<String, lj6> hashMap) {
        final Class<? extends View> class1 = view.getClass();
        for (final String s : hashMap.keySet()) {
            final lj6 lj6 = hashMap.get(s);
            String l;
            if (!lj6.a) {
                l = mqb.l("set", s);
            }
            else {
                l = s;
            }
            try {
                switch (lb0.G(lj6.c)) {
                    default: {
                        continue;
                    }
                    case 7: {
                        class1.getMethod(l, Integer.TYPE).invoke(view, lj6.d);
                        continue;
                    }
                    case 6: {
                        class1.getMethod(l, Float.TYPE).invoke(view, lj6.e);
                        continue;
                    }
                    case 5: {
                        class1.getMethod(l, Boolean.TYPE).invoke(view, lj6.g);
                        continue;
                    }
                    case 4: {
                        class1.getMethod(l, CharSequence.class).invoke(view, lj6.f);
                        continue;
                    }
                    case 3: {
                        final Method method = class1.getMethod(l, Drawable.class);
                        final ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(lj6.h);
                        method.invoke(view, colorDrawable);
                        continue;
                    }
                    case 2: {
                        class1.getMethod(l, Integer.TYPE).invoke(view, lj6.h);
                        continue;
                    }
                    case 1: {
                        class1.getMethod(l, Float.TYPE).invoke(view, lj6.e);
                        continue;
                    }
                    case 0: {
                        class1.getMethod(l, Integer.TYPE).invoke(view, lj6.d);
                        continue;
                    }
                }
            }
            catch (final InvocationTargetException ex) {
                final StringBuilder b = po.B(" Custom Attribute \"", s, "\" not found on ");
                b.append(class1.getName());
                Log.e("TransitionLayout", b.toString());
                ex.printStackTrace();
            }
            catch (final IllegalAccessException ex2) {
                final StringBuilder b2 = po.B(" Custom Attribute \"", s, "\" not found on ");
                b2.append(class1.getName());
                Log.e("TransitionLayout", b2.toString());
                ex2.printStackTrace();
            }
            catch (final NoSuchMethodException ex3) {
                Log.e("TransitionLayout", ex3.getMessage());
                final StringBuilder sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(s);
                sb.append("\" not found on ");
                sb.append(class1.getName());
                Log.e("TransitionLayout", sb.toString());
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(class1.getName());
                sb2.append(" must have a method ");
                sb2.append(l);
                Log.e("TransitionLayout", sb2.toString());
            }
        }
    }
    
    public final float a() {
        switch (lb0.G(this.c)) {
            default: {
                return Float.NaN;
            }
            case 6: {
                return this.e;
            }
            case 5: {
                float n;
                if (this.g) {
                    n = 1.0f;
                }
                else {
                    n = 0.0f;
                }
                return n;
            }
            case 4: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 2:
            case 3: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 1: {
                return this.e;
            }
            case 0: {
                return (float)this.d;
            }
        }
    }
    
    public final void b(final float[] array) {
        switch (lb0.G(this.c)) {
            case 6: {
                array[0] = this.e;
                break;
            }
            case 5: {
                float n;
                if (this.g) {
                    n = 1.0f;
                }
                else {
                    n = 0.0f;
                }
                array[0] = n;
                break;
            }
            case 4: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 2:
            case 3: {
                final int h = this.h;
                final float n2 = (float)Math.pow((h >> 16 & 0xFF) / 255.0f, 2.2);
                final float n3 = (float)Math.pow((h >> 8 & 0xFF) / 255.0f, 2.2);
                final float n4 = (float)Math.pow((h & 0xFF) / 255.0f, 2.2);
                array[0] = n2;
                array[1] = n3;
                array[2] = n4;
                array[3] = (h >> 24 & 0xFF) / 255.0f;
                break;
            }
            case 1: {
                array[0] = this.e;
                break;
            }
            case 0: {
                array[0] = (float)this.d;
                break;
            }
        }
    }
    
    public final int c() {
        final int g = lb0.G(this.c);
        if (g != 2 && g != 3) {
            return 1;
        }
        return 4;
    }
    
    public final void f(final Object o) {
        switch (lb0.G(this.c)) {
            case 6: {
                this.e = (float)o;
                break;
            }
            case 5: {
                this.g = (boolean)o;
                break;
            }
            case 4: {
                this.f = (String)o;
                break;
            }
            case 2:
            case 3: {
                this.h = (int)o;
                break;
            }
            case 1: {
                this.e = (float)o;
                break;
            }
            case 0:
            case 7: {
                this.d = (int)o;
                break;
            }
        }
    }
}
