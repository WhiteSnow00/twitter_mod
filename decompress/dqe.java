import android.util.SparseIntArray;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import android.util.Log;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqe extends zpe
{
    public int e;
    public int f;
    public String g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    
    public dqe() {
        this.e = 0;
        this.f = -1;
        this.g = null;
        this.h = Float.NaN;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = Float.NaN;
        this.l = -1;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = Float.NaN;
        this.w = Float.NaN;
        super.d = new HashMap<String, lj6>();
    }
    
    @Override
    public final void a(final HashMap<String, acx> hashMap) {
        final StringBuilder f = ehk.f("add ");
        f.append(hashMap.size());
        f.append(" values");
        final String string = f.toString();
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        final int min = Math.min(2, stackTrace.length - 1);
        int i = 1;
        String l = " ";
        while (i <= min) {
            final StackTraceElement stackTraceElement = stackTrace[i];
            final StringBuilder f2 = ehk.f(".(");
            f2.append(stackTrace[i].getFileName());
            f2.append(":");
            f2.append(stackTrace[i].getLineNumber());
            f2.append(") ");
            f2.append(stackTrace[i].getMethodName());
            final String string2 = f2.toString();
            l = mqb.l(l, " ");
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(l);
            sb.append(string2);
            sb.append(l);
            Log.v("KeyCycle", sb.toString());
            ++i;
        }
        for (final String s : hashMap.keySet()) {
            final h3r h3r = hashMap.get(s);
            if (h3r == null) {
                continue;
            }
            Objects.requireNonNull(s);
            s.hashCode();
            int n = -1;
            switch (s) {
                case "wavePhase": {
                    n = 13;
                    break;
                }
                case "waveOffset": {
                    n = 12;
                    break;
                }
                case "alpha": {
                    n = 11;
                    break;
                }
                case "transitionPathRotate": {
                    n = 10;
                    break;
                }
                case "elevation": {
                    n = 9;
                    break;
                }
                case "rotation": {
                    n = 8;
                    break;
                }
                case "scaleY": {
                    n = 7;
                    break;
                }
                case "scaleX": {
                    n = 6;
                    break;
                }
                case "progress": {
                    n = 5;
                    break;
                }
                case "translationZ": {
                    n = 4;
                    break;
                }
                case "translationY": {
                    n = 3;
                    break;
                }
                case "translationX": {
                    n = 2;
                    break;
                }
                case "rotationY": {
                    n = 1;
                    break;
                }
                case "rotationX": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    if (!s.startsWith("CUSTOM")) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("  UNKNOWN  ");
                        sb2.append(s);
                        Log.v("WARNING KeyCycle", sb2.toString());
                        continue;
                    }
                    continue;
                }
                case 13: {
                    h3r.b(super.a, this.j);
                    continue;
                }
                case 12: {
                    h3r.b(super.a, this.i);
                    continue;
                }
                case 11: {
                    h3r.b(super.a, this.m);
                    continue;
                }
                case 10: {
                    h3r.b(super.a, this.p);
                    continue;
                }
                case 9: {
                    h3r.b(super.a, this.n);
                    continue;
                }
                case 8: {
                    h3r.b(super.a, this.o);
                    continue;
                }
                case 7: {
                    h3r.b(super.a, this.t);
                    continue;
                }
                case 6: {
                    h3r.b(super.a, this.s);
                    continue;
                }
                case 5: {
                    h3r.b(super.a, this.k);
                    continue;
                }
                case 4: {
                    h3r.b(super.a, this.w);
                    continue;
                }
                case 3: {
                    h3r.b(super.a, this.v);
                    continue;
                }
                case 2: {
                    h3r.b(super.a, this.u);
                    continue;
                }
                case 1: {
                    h3r.b(super.a, this.r);
                    continue;
                }
                case 0: {
                    h3r.b(super.a, this.q);
                    continue;
                }
            }
        }
    }
    
    @Override
    public final zpe b() {
        final dqe dqe = new dqe();
        dqe.c(this);
        dqe.e = this.e;
        dqe.f = this.f;
        dqe.g = this.g;
        dqe.h = this.h;
        dqe.i = this.i;
        dqe.j = this.j;
        dqe.k = this.k;
        dqe.l = this.l;
        dqe.m = this.m;
        dqe.n = this.n;
        dqe.o = this.o;
        dqe.p = this.p;
        dqe.q = this.q;
        dqe.r = this.r;
        dqe.s = this.s;
        dqe.t = this.t;
        dqe.u = this.u;
        dqe.v = this.v;
        dqe.w = this.w;
        return dqe;
    }
    
    public final /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.b();
    }
    
    @Override
    public final void d(final HashSet<String> set) {
        if (!Float.isNaN(this.m)) {
            set.add("alpha");
        }
        if (!Float.isNaN(this.n)) {
            set.add("elevation");
        }
        if (!Float.isNaN(this.o)) {
            set.add("rotation");
        }
        if (!Float.isNaN(this.q)) {
            set.add("rotationX");
        }
        if (!Float.isNaN(this.r)) {
            set.add("rotationY");
        }
        if (!Float.isNaN(this.s)) {
            set.add("scaleX");
        }
        if (!Float.isNaN(this.t)) {
            set.add("scaleY");
        }
        if (!Float.isNaN(this.p)) {
            set.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.u)) {
            set.add("translationX");
        }
        if (!Float.isNaN(this.v)) {
            set.add("translationY");
        }
        if (!Float.isNaN(this.w)) {
            set.add("translationZ");
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
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, dnl.O0);
        final SparseIntArray a = dqe.dqe$a.a;
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            switch (dqe.dqe$a.a.get(index)) {
                default: {
                    final StringBuilder f = ehk.f("unused attribute 0x");
                    f.append(Integer.toHexString(index));
                    f.append("   ");
                    f.append(dqe.dqe$a.a.get(index));
                    Log.e("KeyCycle", f.toString());
                    break;
                }
                case 21: {
                    this.j = obtainStyledAttributes.getFloat(index, this.j) / 360.0f;
                    break;
                }
                case 20: {
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                }
                case 19: {
                    this.w = obtainStyledAttributes.getDimension(index, this.w);
                    break;
                }
                case 18: {
                    this.v = obtainStyledAttributes.getDimension(index, this.v);
                    break;
                }
                case 17: {
                    this.u = obtainStyledAttributes.getDimension(index, this.u);
                    break;
                }
                case 16: {
                    this.t = obtainStyledAttributes.getFloat(index, this.t);
                    break;
                }
                case 15: {
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                }
                case 14: {
                    this.p = obtainStyledAttributes.getFloat(index, this.p);
                    break;
                }
                case 13: {
                    this.r = obtainStyledAttributes.getFloat(index, this.r);
                    break;
                }
                case 12: {
                    this.q = obtainStyledAttributes.getFloat(index, this.q);
                    break;
                }
                case 11: {
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                }
                case 10: {
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                }
                case 9: {
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                }
                case 8: {
                    this.l = obtainStyledAttributes.getInt(index, this.l);
                    break;
                }
                case 7: {
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.i = obtainStyledAttributes.getDimension(index, this.i);
                        break;
                    }
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                    break;
                }
                case 6: {
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                }
                case 5: {
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.g = obtainStyledAttributes.getString(index);
                        this.f = 7;
                        break;
                    }
                    this.f = obtainStyledAttributes.getInt(index, this.f);
                    break;
                }
                case 4: {
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                }
                case 3: {
                    obtainStyledAttributes.getString(index);
                    break;
                }
                case 2: {
                    super.a = obtainStyledAttributes.getInt(index, super.a);
                    break;
                }
                case 1: {
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
            }
        }
    }
    
    public final void g(final HashMap<String, abx> hashMap) {
        for (final String s : hashMap.keySet()) {
            final boolean startsWith = s.startsWith("CUSTOM");
            int n = 7;
            if (startsWith) {
                final lj6 lj6 = super.d.get(s.substring(7));
                if (lj6 == null) {
                    continue;
                }
                if (lj6.c != 2) {
                    continue;
                }
                final abx abx = hashMap.get(s);
                if (abx == null) {
                    continue;
                }
                final int a = super.a;
                final int f = this.f;
                final String g = this.g;
                final int l = this.l;
                ((fqe)abx).f.add(new fqe$b(a, this.h, this.i, this.j, lj6.a()));
                if (l != -1) {
                    ((fqe)abx).e = l;
                }
                ((fqe)abx).c = f;
                ((fqe)abx).b((Object)lj6);
                ((fqe)abx).d = g;
            }
            else {
                Label_0617: {
                    switch (s) {
                        case "wavePhase": {
                            n = 13;
                            break Label_0617;
                        }
                        case "waveOffset": {
                            n = 12;
                            break Label_0617;
                        }
                        case "alpha": {
                            n = 11;
                            break Label_0617;
                        }
                        case "transitionPathRotate": {
                            n = 10;
                            break Label_0617;
                        }
                        case "elevation": {
                            n = 9;
                            break Label_0617;
                        }
                        case "rotation": {
                            n = 8;
                            break Label_0617;
                        }
                        case "scaleY": {
                            break Label_0617;
                        }
                        case "scaleX": {
                            n = 6;
                            break Label_0617;
                        }
                        case "progress": {
                            n = 5;
                            break Label_0617;
                        }
                        case "translationZ": {
                            n = 4;
                            break Label_0617;
                        }
                        case "translationY": {
                            n = 3;
                            break Label_0617;
                        }
                        case "translationX": {
                            n = 2;
                            break Label_0617;
                        }
                        case "rotationY": {
                            n = 1;
                            break Label_0617;
                        }
                        case "rotationX": {
                            n = 0;
                            break Label_0617;
                        }
                        default:
                            break;
                    }
                    n = -1;
                }
                float n2 = 0.0f;
                switch (n) {
                    default: {
                        if (!s.startsWith("CUSTOM")) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("  UNKNOWN  ");
                            sb.append(s);
                            Log.v("WARNING! KeyCycle", sb.toString());
                        }
                        n2 = Float.NaN;
                        break;
                    }
                    case 13: {
                        n2 = this.j;
                        break;
                    }
                    case 12: {
                        n2 = this.i;
                        break;
                    }
                    case 11: {
                        n2 = this.m;
                        break;
                    }
                    case 10: {
                        n2 = this.p;
                        break;
                    }
                    case 9: {
                        n2 = this.n;
                        break;
                    }
                    case 8: {
                        n2 = this.o;
                        break;
                    }
                    case 7: {
                        n2 = this.t;
                        break;
                    }
                    case 6: {
                        n2 = this.s;
                        break;
                    }
                    case 5: {
                        n2 = this.k;
                        break;
                    }
                    case 4: {
                        n2 = this.w;
                        break;
                    }
                    case 3: {
                        n2 = this.v;
                        break;
                    }
                    case 2: {
                        n2 = this.u;
                        break;
                    }
                    case 1: {
                        n2 = this.r;
                        break;
                    }
                    case 0: {
                        n2 = this.q;
                        break;
                    }
                }
                if (Float.isNaN(n2)) {
                    continue;
                }
                final abx abx2 = hashMap.get(s);
                if (abx2 == null) {
                    continue;
                }
                final int a2 = super.a;
                final int f2 = this.f;
                final String g2 = this.g;
                final int i = this.l;
                ((fqe)abx2).f.add(new fqe$b(a2, this.h, this.i, this.j, n2));
                if (i != -1) {
                    ((fqe)abx2).e = i;
                }
                ((fqe)abx2).c = f2;
                ((fqe)abx2).d = g2;
            }
        }
    }
}
