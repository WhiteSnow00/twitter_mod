import android.os.LocaleList;
import java.util.Locale;
import android.content.res.Resources$NotFoundException;
import java.util.WeakHashMap;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import android.annotation.SuppressLint;
import android.util.DisplayMetrics;
import android.content.res.TypedArray;
import java.util.Objects;
import android.util.TypedValue;
import android.text.method.PasswordTransformationMethod;
import android.os.Build$VERSION;
import android.view.View;
import android.util.AttributeSet;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sk0
{
    public final TextView a;
    public ebt b;
    public ebt c;
    public ebt d;
    public ebt e;
    public ebt f;
    public ebt g;
    public ebt h;
    public final uk0 i;
    public int j;
    public int k;
    public Typeface l;
    public boolean m;
    
    public sk0(final TextView a) {
        this.j = 0;
        this.k = -1;
        this.a = a;
        this.i = new uk0(a);
    }
    
    public static ebt d(final Context context, final fk0 fk0, final int n) {
        final ColorStateList d = fk0.d(context, n);
        if (d != null) {
            final ebt ebt = new ebt();
            ebt.d = true;
            ebt.a = d;
            return ebt;
        }
        return null;
    }
    
    public final void a(final Drawable drawable, final ebt ebt) {
        if (drawable != null && ebt != null) {
            fk0.f(drawable, ebt, ((View)this.a).getDrawableState());
        }
    }
    
    public final void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            final Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            this.a(compoundDrawables[0], this.b);
            this.a(compoundDrawables[1], this.c);
            this.a(compoundDrawables[2], this.d);
            this.a(compoundDrawables[3], this.e);
        }
        if (this.f != null || this.g != null) {
            final Drawable[] a = sk0.b.a(this.a);
            this.a(a[0], this.f);
            this.a(a[2], this.g);
        }
    }
    
    public final void c() {
        this.i.a();
    }
    
    public final ColorStateList e() {
        final ebt h = this.h;
        ColorStateList a;
        if (h != null) {
            a = h.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final PorterDuff$Mode f() {
        final ebt h = this.h;
        PorterDuff$Mode b;
        if (h != null) {
            b = h.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public final boolean g() {
        final uk0 i = this.i;
        return i.i() && i.a != 0;
    }
    
    @SuppressLint({ "NewApi" })
    public final void h(final AttributeSet set, int i) {
        final Context context = ((View)this.a).getContext();
        final fk0 a = fk0.a();
        final int[] o0 = fr0.O0;
        final gbt q = gbt.q(context, set, o0, i);
        final TextView a2 = this.a;
        b7x.y((View)a2, ((View)a2).getContext(), o0, set, q.b, i);
        final int l = q.l(0, -1);
        if (q.o(3)) {
            this.b = d(context, a, q.l(3, 0));
        }
        if (q.o(1)) {
            this.c = d(context, a, q.l(1, 0));
        }
        if (q.o(4)) {
            this.d = d(context, a, q.l(4, 0));
        }
        if (q.o(2)) {
            this.e = d(context, a, q.l(2, 0));
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (q.o(5)) {
            this.f = d(context, a, q.l(5, 0));
        }
        if (q.o(6)) {
            this.g = d(context, a, q.l(6, 0));
        }
        q.r();
        final boolean b = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean a3;
        boolean b2;
        ColorStateList c3;
        ColorStateList c4;
        String s;
        ColorStateList c5;
        String s2;
        if (l != -1) {
            final gbt gbt = new gbt(context, context.obtainStyledAttributes(l, fr0.e1));
            if (!b && gbt.o(14)) {
                a3 = gbt.a(14, false);
                b2 = true;
            }
            else {
                a3 = false;
                b2 = false;
            }
            this.p(context, gbt);
            ColorStateList list = null;
            Label_0424: {
                ColorStateList list2;
                if (sdk_INT < 23) {
                    ColorStateList c;
                    if (gbt.o(3)) {
                        c = gbt.c(3);
                    }
                    else {
                        c = null;
                    }
                    ColorStateList c2;
                    if (gbt.o(4)) {
                        c2 = gbt.c(4);
                    }
                    else {
                        c2 = null;
                    }
                    list = c;
                    list2 = c2;
                    if (gbt.o(5)) {
                        c3 = gbt.c(5);
                        list = c;
                        c4 = c2;
                        break Label_0424;
                    }
                }
                else {
                    list = null;
                    list2 = null;
                }
                c3 = null;
                c4 = list2;
            }
            if (gbt.o(15)) {
                s = gbt.m(15);
            }
            else {
                s = null;
            }
            String m;
            if (sdk_INT >= 26 && gbt.o(13)) {
                m = gbt.m(13);
            }
            else {
                m = null;
            }
            gbt.r();
            c5 = list;
            s2 = m;
        }
        else {
            a3 = false;
            b2 = false;
            c5 = null;
            c4 = null;
            c3 = null;
            s = null;
            s2 = null;
        }
        final gbt gbt2 = new gbt(context, context.obtainStyledAttributes(set, fr0.e1, i, 0));
        boolean a4 = a3;
        boolean b3 = b2;
        if (!b) {
            a4 = a3;
            b3 = b2;
            if (gbt2.o(14)) {
                a4 = gbt2.a(14, false);
                b3 = true;
            }
        }
        ColorStateList textColor = c5;
        ColorStateList hintTextColor = c4;
        ColorStateList c6 = c3;
        if (sdk_INT < 23) {
            if (gbt2.o(3)) {
                c5 = gbt2.c(3);
            }
            if (gbt2.o(4)) {
                c4 = gbt2.c(4);
            }
            textColor = c5;
            hintTextColor = c4;
            c6 = c3;
            if (gbt2.o(5)) {
                c6 = gbt2.c(5);
                hintTextColor = c4;
                textColor = c5;
            }
        }
        if (gbt2.o(15)) {
            s = gbt2.m(15);
        }
        String j = s2;
        if (sdk_INT >= 26) {
            j = s2;
            if (gbt2.o(13)) {
                j = gbt2.m(13);
            }
        }
        if (sdk_INT >= 28 && gbt2.o(0) && gbt2.f(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.p(context, gbt2);
        gbt2.r();
        if (textColor != null) {
            this.a.setTextColor(textColor);
        }
        if (hintTextColor != null) {
            this.a.setHintTextColor(hintTextColor);
        }
        if (c6 != null) {
            this.a.setLinkTextColor(c6);
        }
        if (!b && b3) {
            this.j(a4);
        }
        final Typeface k = this.l;
        if (k != null) {
            if (this.k == -1) {
                this.a.setTypeface(k, this.j);
            }
            else {
                this.a.setTypeface(k);
            }
        }
        if (j != null) {
            sk0.e.d(this.a, j);
        }
        if (s != null) {
            if (sdk_INT >= 24) {
                sk0.d.b(this.a, sk0.d.a(s));
            }
            else {
                sk0.b.c(this.a, sk0.c.a(s.split(",")[0]));
            }
        }
        final uk0 i2 = this.i;
        final Context j2 = i2.j;
        final int[] p2 = fr0.P0;
        final TypedArray obtainStyledAttributes = j2.obtainStyledAttributes(set, p2, i, 0);
        final TextView i3 = i2.i;
        b7x.y((View)i3, ((View)i3).getContext(), p2, set, obtainStyledAttributes, i);
        if (obtainStyledAttributes.hasValue(5)) {
            i2.a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension;
        if (obtainStyledAttributes.hasValue(4)) {
            dimension = obtainStyledAttributes.getDimension(4, -1.0f);
        }
        else {
            dimension = -1.0f;
        }
        float dimension2;
        if (obtainStyledAttributes.hasValue(2)) {
            dimension2 = obtainStyledAttributes.getDimension(2, -1.0f);
        }
        else {
            dimension2 = -1.0f;
        }
        float dimension3;
        if (obtainStyledAttributes.hasValue(1)) {
            dimension3 = obtainStyledAttributes.getDimension(1, -1.0f);
        }
        else {
            dimension3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3)) {
            i = obtainStyledAttributes.getResourceId(3, 0);
            if (i > 0) {
                final TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(i);
                final int length = obtainTypedArray.length();
                final int[] array = new int[length];
                if (length > 0) {
                    for (i = 0; i < length; ++i) {
                        array[i] = obtainTypedArray.getDimensionPixelSize(i, -1);
                    }
                    i2.f = i2.b(array);
                    i2.h();
                }
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (i2.i()) {
            if (i2.a == 1) {
                if (!i2.g) {
                    final DisplayMetrics displayMetrics = i2.j.getResources().getDisplayMetrics();
                    float applyDimension = dimension2;
                    if (dimension2 == -1.0f) {
                        applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    float applyDimension2 = dimension3;
                    if (dimension3 == -1.0f) {
                        applyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    float n = dimension;
                    if (dimension == -1.0f) {
                        n = 1.0f;
                    }
                    i2.j(applyDimension, applyDimension2, n);
                }
                i2.g();
            }
        }
        else {
            i2.a = 0;
        }
        if (d91.h) {
            final uk0 i4 = this.i;
            if (i4.a != 0) {
                final int[] f = i4.f;
                if (f.length > 0) {
                    if (sk0.e.a(this.a) != -1.0f) {
                        sk0.e.b(this.a, Math.round(this.i.d), Math.round(this.i.e), Math.round(this.i.c), 0);
                    }
                    else {
                        sk0.e.c(this.a, f, 0);
                    }
                }
            }
        }
        final gbt gbt3 = new gbt(context, context.obtainStyledAttributes(set, fr0.P0));
        i = gbt3.l(8, -1);
        Drawable b4;
        if (i != -1) {
            b4 = a.b(context, i);
        }
        else {
            b4 = null;
        }
        i = gbt3.l(13, -1);
        Drawable b5;
        if (i != -1) {
            b5 = a.b(context, i);
        }
        else {
            b5 = null;
        }
        i = gbt3.l(9, -1);
        Drawable b6;
        if (i != -1) {
            b6 = a.b(context, i);
        }
        else {
            b6 = null;
        }
        i = gbt3.l(6, -1);
        Drawable b7;
        if (i != -1) {
            b7 = a.b(context, i);
        }
        else {
            b7 = null;
        }
        i = gbt3.l(10, -1);
        Drawable b8;
        if (i != -1) {
            b8 = a.b(context, i);
        }
        else {
            b8 = null;
        }
        i = gbt3.l(7, -1);
        Drawable b9;
        if (i != -1) {
            b9 = a.b(context, i);
        }
        else {
            b9 = null;
        }
        if (b8 == null && b9 == null) {
            if (b4 != null || b5 != null || b6 != null || b7 != null) {
                final Drawable[] a5 = sk0.b.a(this.a);
                if (a5[0] == null && a5[2] == null) {
                    final Drawable[] compoundDrawables = this.a.getCompoundDrawables();
                    final TextView a6 = this.a;
                    if (b4 == null) {
                        b4 = compoundDrawables[0];
                    }
                    if (b5 == null) {
                        b5 = compoundDrawables[1];
                    }
                    if (b6 == null) {
                        b6 = compoundDrawables[2];
                    }
                    if (b7 == null) {
                        b7 = compoundDrawables[3];
                    }
                    a6.setCompoundDrawablesWithIntrinsicBounds(b4, b5, b6, b7);
                }
                else {
                    final TextView a7 = this.a;
                    final Drawable drawable = a5[0];
                    if (b5 == null) {
                        b5 = a5[1];
                    }
                    final Drawable drawable2 = a5[2];
                    if (b7 == null) {
                        b7 = a5[3];
                    }
                    sk0.b.b(a7, drawable, b5, drawable2, b7);
                }
            }
        }
        else {
            final Drawable[] a8 = sk0.b.a(this.a);
            final TextView a9 = this.a;
            if (b8 == null) {
                b8 = a8[0];
            }
            if (b5 == null) {
                b5 = a8[1];
            }
            if (b9 == null) {
                b9 = a8[2];
            }
            if (b7 == null) {
                b7 = a8[3];
            }
            sk0.b.b(a9, b8, b5, b9, b7);
        }
        if (gbt3.o(11)) {
            final ColorStateList c7 = gbt3.c(11);
            final TextView a10 = this.a;
            Objects.requireNonNull(a10);
            if (Build$VERSION.SDK_INT >= 24) {
                uks$c.f(a10, c7);
            }
            else if (a10 instanceof hbt) {
                ((hbt)a10).setSupportCompoundDrawablesTintList(c7);
            }
        }
        if (gbt3.o(12)) {
            final PorterDuff$Mode d = je9.d(gbt3.j(12, -1), null);
            final TextView a11 = this.a;
            Objects.requireNonNull(a11);
            if (Build$VERSION.SDK_INT >= 24) {
                uks$c.g(a11, d);
            }
            else if (a11 instanceof hbt) {
                ((hbt)a11).setSupportCompoundDrawablesTintMode(d);
            }
        }
        final int f2 = gbt3.f(15, -1);
        final int f3 = gbt3.f(18, -1);
        i = gbt3.f(19, -1);
        gbt3.r();
        if (f2 != -1) {
            uks.b(this.a, f2);
        }
        if (f3 != -1) {
            uks.c(this.a, f3);
        }
        if (i != -1) {
            uks.d(this.a, i);
        }
    }
    
    public final void i(final Context context, int sdk_INT) {
        final gbt gbt = new gbt(context, context.obtainStyledAttributes(sdk_INT, fr0.e1));
        if (gbt.o(14)) {
            this.j(gbt.a(14, false));
        }
        sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 23) {
            if (gbt.o(3)) {
                final ColorStateList c = gbt.c(3);
                if (c != null) {
                    this.a.setTextColor(c);
                }
            }
            if (gbt.o(5)) {
                final ColorStateList c2 = gbt.c(5);
                if (c2 != null) {
                    this.a.setLinkTextColor(c2);
                }
            }
            if (gbt.o(4)) {
                final ColorStateList c3 = gbt.c(4);
                if (c3 != null) {
                    this.a.setHintTextColor(c3);
                }
            }
        }
        if (gbt.o(0) && gbt.f(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.p(context, gbt);
        if (sdk_INT >= 26 && gbt.o(13)) {
            final String m = gbt.m(13);
            if (m != null) {
                sk0.e.d(this.a, m);
            }
        }
        gbt.r();
        final Typeface l = this.l;
        if (l != null) {
            this.a.setTypeface(l, this.j);
        }
    }
    
    public final void j(final boolean allCaps) {
        this.a.setAllCaps(allCaps);
    }
    
    public final void k(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        final uk0 i = this.i;
        if (i.i()) {
            final DisplayMetrics displayMetrics = i.j.getResources().getDisplayMetrics();
            i.j(TypedValue.applyDimension(n4, (float)n, displayMetrics), TypedValue.applyDimension(n4, (float)n2, displayMetrics), TypedValue.applyDimension(n4, (float)n3, displayMetrics));
            if (i.g()) {
                i.a();
            }
        }
    }
    
    public final void l(final int[] array, final int n) throws IllegalArgumentException {
        final uk0 i = this.i;
        if (i.i()) {
            final int length = array.length;
            int n2 = 0;
            if (length > 0) {
                final int[] array2 = new int[length];
                int[] copy;
                if (n == 0) {
                    copy = Arrays.copyOf(array, length);
                }
                else {
                    final DisplayMetrics displayMetrics = i.j.getResources().getDisplayMetrics();
                    while (true) {
                        copy = array2;
                        if (n2 >= length) {
                            break;
                        }
                        array2[n2] = Math.round(TypedValue.applyDimension(n, (float)array[n2], displayMetrics));
                        ++n2;
                    }
                }
                i.f = i.b(copy);
                if (!i.h()) {
                    final StringBuilder f = ehk.f("None of the preset sizes is valid: ");
                    f.append(Arrays.toString(array));
                    throw new IllegalArgumentException(f.toString());
                }
            }
            else {
                i.g = false;
            }
            if (i.g()) {
                i.a();
            }
        }
    }
    
    public final void m(final int n) {
        final uk0 i = this.i;
        if (i.i()) {
            if (n != 0) {
                if (n != 1) {
                    throw new IllegalArgumentException(rk0.B("Unknown auto-size text type: ", n));
                }
                final DisplayMetrics displayMetrics = i.j.getResources().getDisplayMetrics();
                i.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (i.g()) {
                    i.a();
                }
            }
            else {
                i.a = 0;
                i.d = -1.0f;
                i.e = -1.0f;
                i.c = -1.0f;
                i.f = new int[0];
                i.b = false;
            }
        }
    }
    
    public final void n(final ColorStateList a) {
        if (this.h == null) {
            this.h = new ebt();
        }
        final ebt h = this.h;
        h.a = a;
        h.d = (a != null);
        this.b = h;
        this.c = h;
        this.d = h;
        this.e = h;
        this.f = h;
        this.g = h;
    }
    
    public final void o(final PorterDuff$Mode b) {
        if (this.h == null) {
            this.h = new ebt();
        }
        final ebt h = this.h;
        h.b = b;
        h.c = (b != null);
        this.b = h;
        this.c = h;
        this.d = h;
        this.e = h;
        this.f = h;
        this.g = h;
    }
    
    public final void p(final Context context, final gbt gbt) {
        this.j = gbt.j(2, this.j);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = false;
        if (sdk_INT >= 28 && (this.k = gbt.j(11, -1)) != -1) {
            this.j = ((this.j & 0x2) | 0x0);
        }
        int n = 10;
        if (!gbt.o(10) && !gbt.o(12)) {
            if (gbt.o(1)) {
                this.m = false;
                final int j = gbt.j(1, 1);
                if (j != 1) {
                    if (j != 2) {
                        if (j == 3) {
                            this.l = Typeface.MONOSPACE;
                        }
                    }
                    else {
                        this.l = Typeface.SERIF;
                    }
                }
                else {
                    this.l = Typeface.SANS_SERIF;
                }
            }
            return;
        }
        this.l = null;
        if (gbt.o(12)) {
            n = 12;
        }
        final int k = this.k;
        final int i = this.j;
        if (!context.isRestricted()) {
            final dsm$e dsm$e = new dsm$e(this, k, i, new WeakReference((T)this.a)) {
                public final int a;
                public final int b;
                public final WeakReference c;
                public final sk0 d;
                
                public final void d(final int n) {
                }
                
                public final void e(final Typeface typeface) {
                    Typeface a = typeface;
                    if (Build$VERSION.SDK_INT >= 28) {
                        final int a2 = this.a;
                        a = typeface;
                        if (a2 != -1) {
                            a = sk0.f.a(typeface, a2, (this.b & 0x2) != 0x0);
                        }
                    }
                    final sk0 d = this.d;
                    final WeakReference c = this.c;
                    if (d.m) {
                        d.l = a;
                        final TextView textView = (TextView)c.get();
                        if (textView != null) {
                            final WeakHashMap a3 = b7x.a;
                            if (b7x$g.b((View)textView)) {
                                ((View)textView).post((Runnable)new tk0(textView, a, d.j));
                            }
                            else {
                                textView.setTypeface(a, d.j);
                            }
                        }
                    }
                }
            };
            try {
                final Typeface l = gbt.i(n, this.j, (dsm$e)dsm$e);
                if (l != null) {
                    if (sdk_INT >= 28 && this.k != -1) {
                        this.l = sk0.f.a(Typeface.create(l, 0), this.k, (this.j & 0x2) != 0x0);
                    }
                    else {
                        this.l = l;
                    }
                }
                this.m = (this.l == null);
            }
            catch (final UnsupportedOperationException | Resources$NotFoundException ex) {}
        }
        if (this.l == null) {
            final String m = gbt.m(n);
            if (m != null) {
                if (Build$VERSION.SDK_INT >= 28 && this.k != -1) {
                    final Typeface create = Typeface.create(m, 0);
                    final int k2 = this.k;
                    boolean b2 = b;
                    if ((this.j & 0x2) != 0x0) {
                        b2 = true;
                    }
                    this.l = sk0.f.a(create, k2, b2);
                }
                else {
                    this.l = Typeface.create(m, this.j);
                }
            }
        }
    }
    
    public static final class b
    {
        public static Drawable[] a(final TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
        
        public static void b(final TextView textView, final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
        
        public static void c(final TextView textView, final Locale textLocale) {
            textView.setTextLocale(textLocale);
        }
    }
    
    public static final class c
    {
        public static Locale a(final String s) {
            return Locale.forLanguageTag(s);
        }
    }
    
    public static final class d
    {
        public static LocaleList a(final String s) {
            return LocaleList.forLanguageTags(s);
        }
        
        public static void b(final TextView textView, final LocaleList textLocales) {
            textView.setTextLocales(textLocales);
        }
    }
    
    public static final class e
    {
        public static int a(final TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }
        
        public static void b(final TextView textView, final int n, final int n2, final int n3, final int n4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
        }
        
        public static void c(final TextView textView, final int[] array, final int n) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
        }
        
        public static boolean d(final TextView textView, final String fontVariationSettings) {
            return textView.setFontVariationSettings(fontVariationSettings);
        }
    }
    
    public static final class f
    {
        public static Typeface a(final Typeface typeface, final int n, final boolean b) {
            return Typeface.create(typeface, n, b);
        }
    }
}
