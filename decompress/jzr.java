import android.os.Build$VERSION;
import android.view.View;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Constructor;
import android.view.SubMenu;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.Menu;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import android.view.MenuInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzr extends MenuInflater
{
    public static final Class<?>[] e;
    public static final Class<?>[] f;
    public final Object[] a;
    public final Object[] b;
    public Context c;
    public Object d;
    
    static {
        f = (e = new Class[] { Context.class });
    }
    
    public jzr(final Context c) {
        super(c);
        this.c = c;
        final Object[] array = { c };
        this.a = array;
        this.b = array;
    }
    
    public final Object a(final Object o) {
        if (o instanceof Activity) {
            return o;
        }
        Object a = o;
        if (o instanceof ContextWrapper) {
            a = this.a(((ContextWrapper)o).getBaseContext());
        }
        return a;
    }
    
    public final void b(final XmlPullParser xmlPullParser, final AttributeSet set, final Menu menu) throws XmlPullParserException, IOException {
        final b b = new b(menu);
        int i = xmlPullParser.getEventType();
        String name3;
        while (true) {
            while (i != 2) {
                i = xmlPullParser.next();
                if (i == 1) {
                    int j = 0;
                    int n = 0;
                    Object o = null;
                    int next = i;
                    while (j == 0) {
                        if (next == 1) {
                            throw new RuntimeException("Unexpected end of document");
                        }
                        int n2 = 0;
                        Label_1012: {
                            if (next != 2) {
                                if (next == 3) {
                                    final String name = xmlPullParser.getName();
                                    if (n != 0 && name.equals(o)) {
                                        o = null;
                                        n2 = 0;
                                        break Label_1012;
                                    }
                                    if (name.equals("group")) {
                                        b.b = 0;
                                        b.c = 0;
                                        b.d = 0;
                                        b.e = 0;
                                        b.f = true;
                                        b.g = true;
                                    }
                                    else if (name.equals("item")) {
                                        if (!b.h) {
                                            final xk z = b.z;
                                            if (z != null && z.a()) {
                                                b.a();
                                            }
                                            else {
                                                b.h = true;
                                                b.c(b.a.add(b.b, b.i, b.j, b.k));
                                            }
                                        }
                                    }
                                    else if (name.equals("menu")) {
                                        j = 1;
                                        n2 = n;
                                        break Label_1012;
                                    }
                                }
                            }
                            else if (n == 0) {
                                final String name2 = xmlPullParser.getName();
                                if (name2.equals("group")) {
                                    final TypedArray obtainStyledAttributes = b.E.c.obtainStyledAttributes(set, jee.X0);
                                    b.b = obtainStyledAttributes.getResourceId(1, 0);
                                    b.c = obtainStyledAttributes.getInt(3, 0);
                                    b.d = obtainStyledAttributes.getInt(4, 0);
                                    b.e = obtainStyledAttributes.getInt(5, 0);
                                    b.f = obtainStyledAttributes.getBoolean(2, true);
                                    b.g = obtainStyledAttributes.getBoolean(0, true);
                                    obtainStyledAttributes.recycle();
                                }
                                else if (name2.equals("item")) {
                                    final kat p3 = kat.p(b.E.c, set, jee.Y0);
                                    b.i = p3.l(2, 0);
                                    b.j = ((p3.j(5, b.c) & 0xFFFF0000) | (p3.j(6, b.d) & 0xFFFF));
                                    b.k = p3.n(7);
                                    b.l = p3.n(8);
                                    b.m = p3.l(0, 0);
                                    final String m = p3.m(9);
                                    char char1;
                                    if (m == null) {
                                        char1 = '\0';
                                    }
                                    else {
                                        char1 = m.charAt(0);
                                    }
                                    b.n = char1;
                                    b.o = p3.j(16, 4096);
                                    final String k = p3.m(10);
                                    char char2;
                                    if (k == null) {
                                        char2 = '\0';
                                    }
                                    else {
                                        char2 = k.charAt(0);
                                    }
                                    b.p = char2;
                                    b.q = p3.j(20, 4096);
                                    if (p3.o(11)) {
                                        b.r = (p3.a(11, false) ? 1 : 0);
                                    }
                                    else {
                                        b.r = b.e;
                                    }
                                    b.s = p3.a(3, false);
                                    b.t = p3.a(4, b.f);
                                    b.u = p3.a(1, b.g);
                                    b.v = p3.j(21, -1);
                                    b.y = p3.m(12);
                                    b.w = p3.l(13, 0);
                                    b.x = p3.m(15);
                                    final String l = p3.m(14);
                                    final boolean b2 = l != null;
                                    if (b2 && b.w == 0 && b.x == null) {
                                        b.z = (xk)b.b(l, jzr.f, b.E.b);
                                    }
                                    else {
                                        if (b2) {
                                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                        }
                                        b.z = null;
                                    }
                                    b.A = p3.n(17);
                                    b.B = p3.n(22);
                                    if (p3.o(19)) {
                                        b.D = gd9.d(p3.j(19, -1), b.D);
                                    }
                                    else {
                                        b.D = null;
                                    }
                                    if (p3.o(18)) {
                                        b.C = p3.c(18);
                                    }
                                    else {
                                        b.C = null;
                                    }
                                    p3.r();
                                    b.h = false;
                                }
                                else {
                                    if (name2.equals("menu")) {
                                        this.b(xmlPullParser, set, (Menu)b.a());
                                        n2 = n;
                                        break Label_1012;
                                    }
                                    n2 = 1;
                                    o = name2;
                                    break Label_1012;
                                }
                            }
                            n2 = n;
                        }
                        next = xmlPullParser.next();
                        n = n2;
                    }
                    return;
                }
            }
            name3 = xmlPullParser.getName();
            if (name3.equals("menu")) {
                i = xmlPullParser.next();
                continue;
            }
            break;
        }
        throw new RuntimeException(hmg.h("Expecting menu, got ", name3));
    }
    
    public final void inflate(final int n, final Menu menu) {
        if (!(menu instanceof izr)) {
            super.inflate(n, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                final XmlResourceParser xmlResourceParser = layout = this.c.getResources().getLayout(n);
                this.b((XmlPullParser)xmlResourceParser, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), menu);
                xmlResourceParser.close();
            }
            finally {
                if (layout != null) {
                    layout.close();
                }
            }
        }
        catch (final IOException ex) {}
        catch (final XmlPullParserException ex2) {}
    }
    
    public static final class a implements MenuItem$OnMenuItemClickListener
    {
        public static final Class<?>[] c;
        public Object a;
        public Method b;
        
        static {
            c = new Class[] { MenuItem.class };
        }
        
        public a(final Object a, final String s) {
            this.a = a;
            final Class<?> class1 = a.getClass();
            try {
                this.b = class1.getMethod(s, a.c);
            }
            catch (final Exception ex) {
                final StringBuilder y = pd.y("Couldn't resolve menu item onClick handler ", s, " in class ");
                y.append(class1.getName());
                final InflateException ex2 = new InflateException(y.toString());
                ((Throwable)ex2).initCause(ex);
                throw ex2;
            }
        }
        
        public final boolean onMenuItemClick(final MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return (boolean)this.b.invoke(this.a, menuItem);
                }
                this.b.invoke(this.a, menuItem);
                return true;
            }
            catch (final Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    public final class b
    {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C;
        public PorterDuff$Mode D;
        public final jzr E;
        public Menu a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public xk z;
        
        public b(final jzr e, final Menu a) {
            this.E = e;
            this.C = null;
            this.D = null;
            this.a = a;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
        
        public final SubMenu a() {
            this.h = true;
            final SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.c(addSubMenu.getItem());
            return addSubMenu;
        }
        
        public final <T> T b(final String s, final Class<?>[] array, final Object[] array2) {
            try {
                final Constructor<?> constructor = Class.forName(s, false, this.E.c.getClassLoader()).getConstructor(array);
                constructor.setAccessible(true);
                return (T)constructor.newInstance(array2);
            }
            catch (final Exception ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(s);
                Log.w("SupportMenuInflater", sb.toString(), (Throwable)ex);
                return null;
            }
        }
        
        public final void c(final MenuItem menuItem) {
            final MenuItem setEnabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            final int r = this.r;
            boolean b = false;
            setEnabled.setCheckable(r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            final int v = this.v;
            if (v >= 0) {
                menuItem.setShowAsAction(v);
            }
            if (this.y != null) {
                if (this.E.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                final jzr e = this.E;
                if (e.d == null) {
                    final Context c = e.c;
                    Object a;
                    if (c instanceof Activity) {
                        a = c;
                    }
                    else {
                        a = c;
                        if (c instanceof ContextWrapper) {
                            a = e.a(((ContextWrapper)c).getBaseContext());
                        }
                    }
                    e.d = a;
                }
                menuItem.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new a(e.d, this.y));
            }
            if (this.r >= 2) {
                if (menuItem instanceof g) {
                    final g g = (g)menuItem;
                    g.x = ((g.x & 0xFFFFFFFB) | 0x4);
                }
                else if (menuItem instanceof b5h) {
                    final b5h b5h = (b5h)menuItem;
                    try {
                        if (b5h.e == null) {
                            b5h.e = b5h.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        b5h.e.invoke(b5h.d, Boolean.TRUE);
                    }
                    catch (final Exception ex) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", (Throwable)ex);
                    }
                }
            }
            final String x = this.x;
            if (x != null) {
                menuItem.setActionView((View)this.b(x, jzr.e, this.E.a));
                b = true;
            }
            final int w = this.w;
            if (w > 0) {
                if (!b) {
                    menuItem.setActionView(w);
                }
                else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            final xk z = this.z;
            if (z != null) {
                if (menuItem instanceof kzr) {
                    ((kzr)menuItem).a(z);
                }
                else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            y4h.a(menuItem, this.A);
            final CharSequence b2 = this.B;
            final boolean b3 = menuItem instanceof kzr;
            if (b3) {
                ((kzr)menuItem).setTooltipText(b2);
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                y4h.a.m(menuItem, b2);
            }
            final char n = this.n;
            final int o = this.o;
            if (b3) {
                ((kzr)menuItem).setAlphabeticShortcut(n, o);
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                y4h.a.g(menuItem, n, o);
            }
            final char p = this.p;
            final int q = this.q;
            if (b3) {
                ((kzr)menuItem).setNumericShortcut(p, q);
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                y4h.a.k(menuItem, p, q);
            }
            final PorterDuff$Mode d = this.D;
            if (d != null) {
                if (b3) {
                    ((kzr)menuItem).setIconTintMode(d);
                }
                else if (Build$VERSION.SDK_INT >= 26) {
                    y4h.a.j(menuItem, d);
                }
            }
            final ColorStateList c2 = this.C;
            if (c2 != null) {
                if (b3) {
                    ((kzr)menuItem).setIconTintList(c2);
                }
                else if (Build$VERSION.SDK_INT >= 26) {
                    y4h.a.i(menuItem, c2);
                }
            }
        }
    }
}
