import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.DefaultDateTypeAdapter$b;
import com.google.gson.internal.sql.a;
import java.util.Collections;
import java.util.Collection;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.lang.reflect.Type;
import java.util.Map;
import com.google.gson.internal.Excluder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v9c
{
    public Excluder a;
    public lcg.lcg$a b;
    public pxa$a c;
    public final Map<Type, jtd<?>> d;
    public final List<ghv> e;
    public final List<ghv> f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public xet$a l;
    public xet$b m;
    
    public v9c() {
        this.a = Excluder.H0;
        this.b = lcg.C0;
        this.c = pxa.C0;
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        final ekv n = Gson.n;
        this.g = 2;
        this.h = 2;
        this.i = false;
        this.j = true;
        this.k = true;
        this.l = xet.C0;
        this.m = xet.D0;
    }
    
    public final Gson a() {
        final ArrayList list = new ArrayList(this.f.size() + this.e.size() + 3);
        list.addAll(this.e);
        Collections.reverse(list);
        final ArrayList list2 = new ArrayList(this.f);
        Collections.reverse(list2);
        list.addAll(list2);
        final int g = this.g;
        final int h = this.h;
        final boolean a = com.google.gson.internal.sql.a.a;
        if (g != 2 && h != 2) {
            final ghv a2 = ((DefaultDateTypeAdapter$b)DefaultDateTypeAdapter$b.b).a(g, h);
            ghv a3 = null;
            ghv a4;
            if (a) {
                a3 = ((DefaultDateTypeAdapter$b)com.google.gson.internal.sql.a.c).a(g, h);
                a4 = ((DefaultDateTypeAdapter$b)com.google.gson.internal.sql.a.b).a(g, h);
            }
            else {
                a4 = null;
            }
            list.add(a2);
            if (a) {
                list.add(a3);
                list.add(a4);
            }
        }
        return new Gson(this.a, (qxa)this.c, (Map)this.d, this.j, this.i, this.k, (lcg)this.b, (List)this.e, (List)this.f, (List)list, (yet)this.l, (yet)this.m);
    }
    
    public final v9c b(final Type type, final Object o) {
        final boolean b = o instanceof nie;
        q0b.e(b || o instanceof vee || o instanceof jtd || o instanceof TypeAdapter);
        if (o instanceof jtd) {
            this.d.put(type, o);
        }
        if (b || o instanceof vee) {
            this.e.add(TreeTypeAdapter.a(new ekv(type), o));
        }
        if (o instanceof TypeAdapter) {
            this.e.add(TypeAdapters.a(new ekv(type), (TypeAdapter)o));
        }
        return this;
    }
}
