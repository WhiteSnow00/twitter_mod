import java.lang.reflect.InvocationTargetException;
import android.content.ContextWrapper;
import java.lang.reflect.Method;
import android.view.View$OnClickListener;
import android.view.InflateException;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatButton;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import java.lang.reflect.Constructor;

// 
// Decompiled by Procyon v0.6.0
// 

public class wk0
{
    public static final Class<?>[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final String[] g;
    public static final z8q<String, Constructor<? extends View>> h;
    public final Object[] a;
    
    static {
        b = new Class[] { Context.class, AttributeSet.class };
        c = new int[] { 16843375 };
        d = new int[] { 16844160 };
        e = new int[] { 16844156 };
        f = new int[] { 16844148 };
        g = new String[] { "android.widget.", "android.view.", "android.webkit." };
        h = new z8q();
    }
    
    public wk0() {
        this.a = new Object[2];
    }
    
    public rj0 a(final Context context, final AttributeSet set) {
        return new rj0(context, set);
    }
    
    public AppCompatButton b(final Context context, final AttributeSet set) {
        return new AppCompatButton(context, set);
    }
    
    public AppCompatCheckBox c(final Context context, final AttributeSet set) {
        return new AppCompatCheckBox(context, set);
    }
    
    public mk0 d(final Context context, final AttributeSet set) {
        return new mk0(context, set);
    }
    
    public AppCompatTextView e(final Context context, final AttributeSet set) {
        return new AppCompatTextView(context, set);
    }
    
    public View f(final Context context, final String s, final AttributeSet set) {
        return null;
    }
    
    public final View g(final Context context, final String s, String string) throws ClassNotFoundException, InflateException {
        final z8q<String, Constructor<? extends View>> h = wk0.h;
        Label_0096: {
            Constructor<? extends View> constructor;
            if ((constructor = (Constructor)h.getOrDefault((Object)s, (Object)null)) != null) {
                break Label_0096;
            }
            Label_0063: {
                if (string == null) {
                    break Label_0063;
                }
                try {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(s);
                    string = sb.toString();
                    while (true) {
                        constructor = Class.forName(string, false, context.getClassLoader()).asSubclass(View.class).getConstructor(wk0.b);
                        h.put((Object)s, (Object)constructor);
                        constructor.setAccessible(true);
                        return (View)constructor.newInstance(this.a);
                        string = s;
                        continue;
                    }
                }
                catch (final Exception ex) {
                    return null;
                }
            }
        }
    }
    
    public final void h(final View view, final String s) {
        if (view != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append(" asked to inflate view for <");
        sb.append(s);
        sb.append(">, but returned null");
        throw new IllegalStateException(sb.toString());
    }
    
    public static final class a implements View$OnClickListener
    {
        public final View F0;
        public final String G0;
        public Method H0;
        public Context I0;
        
        public a(final View f0, final String g0) {
            this.F0 = f0;
            this.G0 = g0;
        }
        
        public final void onClick(final View view) {
            Label_0200: {
                if (this.H0 == null) {
                    Object i0 = this.F0.getContext();
                    while (i0 != null) {
                        try {
                            if (!((Context)i0).isRestricted()) {
                                final Method method = ((Context)i0).getClass().getMethod(this.G0, View.class);
                                if (method != null) {
                                    this.H0 = method;
                                    this.I0 = (Context)i0;
                                    break Label_0200;
                                }
                            }
                        }
                        catch (final NoSuchMethodException ex) {}
                        if (i0 instanceof ContextWrapper) {
                            i0 = ((ContextWrapper)i0).getBaseContext();
                        }
                        else {
                            i0 = null;
                        }
                    }
                    final int id = this.F0.getId();
                    String string;
                    if (id == -1) {
                        string = "";
                    }
                    else {
                        final StringBuilder f = ehk.f(" with id '");
                        f.append(this.F0.getContext().getResources().getResourceEntryName(id));
                        f.append("'");
                        string = f.toString();
                    }
                    final StringBuilder f2 = ehk.f("Could not find method ");
                    f2.append(this.G0);
                    f2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    f2.append(this.F0.getClass());
                    f2.append(string);
                    throw new IllegalStateException(f2.toString());
                }
                try {
                    this.H0.invoke(this.I0, view);
                }
                catch (final InvocationTargetException ex2) {
                    throw new IllegalStateException("Could not execute method for android:onClick", ex2);
                }
                catch (final IllegalAccessException ex3) {
                    throw new IllegalStateException("Could not execute non-public method for android:onClick", ex3);
                }
            }
        }
    }
}
