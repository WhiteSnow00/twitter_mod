import android.graphics.RectF;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqp
{
    public static final zam m;
    public poa a;
    public poa b;
    public poa c;
    public poa d;
    public ly6 e;
    public ly6 f;
    public ly6 g;
    public ly6 h;
    public kq9 i;
    public kq9 j;
    public kq9 k;
    public kq9 l;
    
    static {
        m = new zam(0.5f);
    }
    
    public pqp() {
        this.a = (poa)new rko();
        this.b = (poa)new rko();
        this.c = (poa)new rko();
        this.d = (poa)new rko();
        this.e = (ly6)new oa(0.0f);
        this.f = (ly6)new oa(0.0f);
        this.g = (ly6)new oa(0.0f);
        this.h = (ly6)new oa(0.0f);
        this.i = new kq9();
        this.j = new kq9();
        this.k = new kq9();
        this.l = new kq9();
    }
    
    public pqp(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.f = a.f;
        this.g = a.g;
        this.h = a.h;
        this.i = a.i;
        this.j = a.j;
        this.k = a.k;
        this.l = a.l;
    }
    
    public static a a(Context obtainStyledAttributes, int int1, int int2, ly6 h) {
        Object o = obtainStyledAttributes;
        int n = int1;
        if (int2 != 0) {
            o = new ContextThemeWrapper(obtainStyledAttributes, int1);
            n = int2;
        }
        obtainStyledAttributes = (Context)((Context)o).obtainStyledAttributes(n, rp2.u1);
        try {
            final int int3 = ((TypedArray)obtainStyledAttributes).getInt(0, 0);
            final int int4 = ((TypedArray)obtainStyledAttributes).getInt(3, int3);
            int1 = ((TypedArray)obtainStyledAttributes).getInt(4, int3);
            int2 = ((TypedArray)obtainStyledAttributes).getInt(2, int3);
            final int int5 = ((TypedArray)obtainStyledAttributes).getInt(1, int3);
            h = d((TypedArray)obtainStyledAttributes, 5, h);
            final ly6 d = d((TypedArray)obtainStyledAttributes, 8, h);
            final ly6 d2 = d((TypedArray)obtainStyledAttributes, 9, h);
            final ly6 d3 = d((TypedArray)obtainStyledAttributes, 7, h);
            h = d((TypedArray)obtainStyledAttributes, 6, h);
            final a a = new a();
            pqp.a.b(a.a = ri4.C(int4));
            a.e = d;
            pqp.a.b(a.b = ri4.C(int1));
            a.f = d2;
            pqp.a.b(a.c = ri4.C(int2));
            a.g = d3;
            pqp.a.b(a.d = ri4.C(int5));
            a.h = h;
            return a;
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public static a b(final Context context, final AttributeSet set, final int n, final int n2) {
        return c(context, set, n, n2, (ly6)new oa((float)0));
    }
    
    public static a c(final Context context, final AttributeSet set, int resourceId, int resourceId2, final ly6 ly6) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, rp2.n1, resourceId, resourceId2);
        resourceId = obtainStyledAttributes.getResourceId(0, 0);
        resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, ly6);
    }
    
    public static ly6 d(final TypedArray typedArray, int type, final ly6 ly6) {
        final TypedValue peekValue = typedArray.peekValue(type);
        if (peekValue == null) {
            return ly6;
        }
        type = peekValue.type;
        if (type == 5) {
            return (ly6)new oa((float)TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (type == 6) {
            return (ly6)new zam(peekValue.getFraction(1.0f, 1.0f));
        }
        return ly6;
    }
    
    public final boolean e(final RectF rectF) {
        final boolean equals = this.l.getClass().equals(kq9.class);
        boolean b = true;
        final boolean b2 = equals && this.j.getClass().equals(kq9.class) && this.i.getClass().equals(kq9.class) && this.k.getClass().equals(kq9.class);
        final float a = this.e.a(rectF);
        final boolean b3 = this.f.a(rectF) == a && this.h.a(rectF) == a && this.g.a(rectF) == a;
        final boolean b4 = this.b instanceof rko && this.a instanceof rko && this.c instanceof rko && this.d instanceof rko;
        if (!b2 || !b3 || !b4) {
            b = false;
        }
        return b;
    }
    
    public final pqp f(final float n) {
        final a a = new a(this);
        a.c(n);
        return a.a();
    }
    
    public static final class a
    {
        public poa a;
        public poa b;
        public poa c;
        public poa d;
        public ly6 e;
        public ly6 f;
        public ly6 g;
        public ly6 h;
        public kq9 i;
        public kq9 j;
        public kq9 k;
        public kq9 l;
        
        public a() {
            this.a = (poa)new rko();
            this.b = (poa)new rko();
            this.c = (poa)new rko();
            this.d = (poa)new rko();
            this.e = (ly6)new oa(0.0f);
            this.f = (ly6)new oa(0.0f);
            this.g = (ly6)new oa(0.0f);
            this.h = (ly6)new oa(0.0f);
            this.i = new kq9();
            this.j = new kq9();
            this.k = new kq9();
            this.l = new kq9();
        }
        
        public a(final pqp pqp) {
            this.a = (poa)new rko();
            this.b = (poa)new rko();
            this.c = (poa)new rko();
            this.d = (poa)new rko();
            this.e = (ly6)new oa(0.0f);
            this.f = (ly6)new oa(0.0f);
            this.g = (ly6)new oa(0.0f);
            this.h = (ly6)new oa(0.0f);
            this.i = new kq9();
            this.j = new kq9();
            this.k = new kq9();
            this.l = new kq9();
            this.a = pqp.a;
            this.b = pqp.b;
            this.c = pqp.c;
            this.d = pqp.d;
            this.e = pqp.e;
            this.f = pqp.f;
            this.g = pqp.g;
            this.h = pqp.h;
            this.i = pqp.i;
            this.j = pqp.j;
            this.k = pqp.k;
            this.l = pqp.l;
        }
        
        public static void b(final poa poa) {
            if (poa instanceof rko) {
                final rko rko = (rko)poa;
                return;
            }
            if (poa instanceof be7) {
                final be7 be7 = (be7)poa;
            }
        }
        
        public final pqp a() {
            return new pqp(this);
        }
        
        public final a c(final float n) {
            this.f(n);
            this.g(n);
            this.e(n);
            this.d(n);
            return this;
        }
        
        public final a d(final float n) {
            this.h = (ly6)new oa(n);
            return this;
        }
        
        public final a e(final float n) {
            this.g = (ly6)new oa(n);
            return this;
        }
        
        public final a f(final float n) {
            this.e = (ly6)new oa(n);
            return this;
        }
        
        public final a g(final float n) {
            this.f = (ly6)new oa(n);
            return this;
        }
    }
}
