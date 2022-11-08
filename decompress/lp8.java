import java.io.Serializable;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class lp8 implements hp8
{
    public aox a;
    public boolean b;
    public boolean c;
    public aox d;
    public int e;
    public int f;
    public int g;
    public int h;
    public hx8 i;
    public boolean j;
    public List<hp8> k;
    public List<lp8> l;
    
    public lp8(final aox d) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.e = 1;
        this.h = 1;
        this.i = null;
        this.j = false;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = d;
    }
    
    public final void a(final hp8 hp8) {
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            if (!((lp8)iterator.next()).j) {
                return;
            }
        }
        this.c = true;
        final aox a = this.a;
        if (a != null) {
            ((hp8)a).a((hp8)this);
        }
        if (this.b) {
            this.d.a((hp8)this);
            return;
        }
        lp8 lp8 = null;
        int n = 0;
        for (final lp8 lp9 : this.l) {
            if (lp9 instanceof hx8) {
                continue;
            }
            ++n;
            lp8 = lp9;
        }
        if (lp8 != null && n == 1 && lp8.j) {
            final hx8 i = this.i;
            if (i != null) {
                if (!((lp8)i).j) {
                    return;
                }
                this.f = this.h * ((lp8)i).g;
            }
            this.d(lp8.g + this.f);
        }
        final aox a2 = this.a;
        if (a2 != null) {
            ((hp8)a2).a((hp8)this);
        }
    }
    
    public final void b(final hp8 hp8) {
        this.k.add(hp8);
        if (this.j) {
            hp8.a(hp8);
        }
    }
    
    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }
    
    public void d(final int g) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = g;
        for (final hp8 hp8 : this.k) {
            hp8.a(hp8);
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.j0);
        sb.append(":");
        sb.append(du1.B(this.e));
        sb.append("(");
        Serializable value;
        if (this.j) {
            value = this.g;
        }
        else {
            value = "unresolved";
        }
        sb.append(value);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
