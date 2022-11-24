import android.util.SparseIntArray;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cre extends zpe
{
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public float s;
    public float t;
    
    public cre() {
        this.e = -1;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = Float.NaN;
        this.t = 0.0f;
        super.d = new HashMap<String, lj6>();
    }
    
    @Override
    public final void a(final HashMap<String, acx> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }
    
    @Override
    public final zpe b() {
        final cre cre = new cre();
        cre.c(this);
        cre.e = this.e;
        cre.r = this.r;
        cre.s = this.s;
        cre.t = this.t;
        cre.q = this.q;
        cre.f = this.f;
        cre.g = this.g;
        cre.h = this.h;
        cre.k = this.k;
        cre.i = this.i;
        cre.j = this.j;
        cre.l = this.l;
        cre.m = this.m;
        cre.n = this.n;
        cre.o = this.o;
        cre.p = this.p;
        return cre;
    }
    
    public final /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.b();
    }
    
    @Override
    public final void d(final HashSet<String> set) {
        if (!Float.isNaN(this.f)) {
            set.add("alpha");
        }
        if (!Float.isNaN(this.g)) {
            set.add("elevation");
        }
        if (!Float.isNaN(this.h)) {
            set.add("rotation");
        }
        if (!Float.isNaN(this.i)) {
            set.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            set.add("rotationY");
        }
        if (!Float.isNaN(this.n)) {
            set.add("translationX");
        }
        if (!Float.isNaN(this.o)) {
            set.add("translationY");
        }
        if (!Float.isNaN(this.p)) {
            set.add("translationZ");
        }
        if (!Float.isNaN(this.k)) {
            set.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.l)) {
            set.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            set.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            set.add("progress");
        }
        if (super.d.size() > 0) {
            for (final String s : super.d.keySet()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CUSTOM,");
                sb.append(s);
                set.add(sb.toString());
            }
        }
    }
    
    @Override
    public final void e(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, dnl.Q0);
        final SparseIntArray a = cre.cre$a.a;
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            switch (cre.cre$a.a.get(index)) {
                default: {
                    final StringBuilder f = ehk.f("unused attribute 0x");
                    f.append(Integer.toHexString(index));
                    f.append("   ");
                    f.append(cre.cre$a.a.get(index));
                    Log.e("KeyTimeCycle", f.toString());
                    break;
                }
                case 21: {
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.t = obtainStyledAttributes.getDimension(index, this.t);
                        break;
                    }
                    this.t = obtainStyledAttributes.getFloat(index, this.t);
                    break;
                }
                case 20: {
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                }
                case 19: {
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        this.r = 7;
                        break;
                    }
                    this.r = obtainStyledAttributes.getInt(index, this.r);
                    break;
                }
                case 18: {
                    this.q = obtainStyledAttributes.getFloat(index, this.q);
                    break;
                }
                case 17: {
                    this.p = obtainStyledAttributes.getDimension(index, this.p);
                    break;
                }
                case 16: {
                    this.o = obtainStyledAttributes.getDimension(index, this.o);
                    break;
                }
                case 15: {
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                }
                case 14: {
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                }
                case 13: {
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                }
                case 12: {
                    super.a = obtainStyledAttributes.getInt(index, super.a);
                    break;
                }
                case 10: {
                    if (trh.i2) {
                        if ((super.b = obtainStyledAttributes.getResourceId(index, super.b)) == -1) {
                            super.c = obtainStyledAttributes.getString(index);
                            break;
                        }
                        break;
                    }
                    else {
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            super.c = obtainStyledAttributes.getString(index);
                            break;
                        }
                        super.b = obtainStyledAttributes.getResourceId(index, super.b);
                        break;
                    }
                    break;
                }
                case 9: {
                    obtainStyledAttributes.getString(index);
                    break;
                }
                case 8: {
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                }
                case 7: {
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                }
                case 6: {
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                }
                case 5: {
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                    break;
                }
                case 4: {
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                }
                case 2: {
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                }
                case 1: {
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                }
            }
        }
    }
    
    @Override
    public final void f(final HashMap<String, Integer> hashMap) {
        if (this.e == -1) {
            return;
        }
        if (!Float.isNaN(this.f)) {
            hashMap.put("alpha", this.e);
        }
        if (!Float.isNaN(this.g)) {
            hashMap.put("elevation", this.e);
        }
        if (!Float.isNaN(this.h)) {
            hashMap.put("rotation", this.e);
        }
        if (!Float.isNaN(this.i)) {
            hashMap.put("rotationX", this.e);
        }
        if (!Float.isNaN(this.j)) {
            hashMap.put("rotationY", this.e);
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("translationX", this.e);
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("translationY", this.e);
        }
        if (!Float.isNaN(this.p)) {
            hashMap.put("translationZ", this.e);
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("transitionPathRotate", this.e);
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("scaleX", this.e);
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("scaleY", this.e);
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("progress", this.e);
        }
        if (super.d.size() > 0) {
            final Iterator<String> iterator = super.d.keySet().iterator();
            while (iterator.hasNext()) {
                hashMap.put(mqb.l("CUSTOM,", (String)iterator.next()), this.e);
            }
        }
    }
}
