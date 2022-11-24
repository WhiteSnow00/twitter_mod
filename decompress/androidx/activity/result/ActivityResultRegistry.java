// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity.result;

import android.os.BaseBundle;
import java.util.Iterator;
import android.util.Log;
import androidx.lifecycle.f;
import androidx.lifecycle.e;
import androidx.lifecycle.d;
import androidx.lifecycle.d$c;
import androidx.fragment.app.Fragment;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.content.Intent;
import java.util.HashMap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry
{
    public Random a;
    public final Map<Integer, String> b;
    public final Map<String, Integer> c;
    public final Map<String, d> d;
    public ArrayList<String> e;
    public final transient Map<String, c<?>> f;
    public final Map<String, Object> g;
    public final Bundle h;
    
    public ActivityResultRegistry() {
        this.a = new Random();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new ArrayList<String>();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new Bundle();
    }
    
    public final void a(final int n, final String s) {
        this.b.put(n, s);
        this.c.put(s, n);
    }
    
    public final boolean b(final int n, final int n2, final Intent intent) {
        final String s = this.b.get(n);
        if (s == null) {
            return false;
        }
        final c c = this.f.get(s);
        if (c != null && c.a != null && this.e.contains(s)) {
            c.a.f((Object)c.b.c(n2, intent));
            this.e.remove(s);
        }
        else {
            this.g.remove(s);
            this.h.putParcelable(s, (Parcelable)new eo(n2, intent));
        }
        return true;
    }
    
    public abstract <I, O> void c(final int p0, final jo<I, O> p1, @SuppressLint({ "UnknownNullness" }) final I p2, final xn p3);
    
    public final <I, O> no<I> d(final String s, final jo<I, O> jo, final io<O> io) {
        this.f(s);
        this.f.put(s, new c((io<Object>)io, (jo<?, Object>)jo));
        if (this.g.containsKey(s)) {
            final Object value = this.g.get(s);
            this.g.remove(s);
            io.f(value);
        }
        final eo eo = (eo)this.h.getParcelable(s);
        if (eo != null) {
            this.h.remove(s);
            io.f(jo.c(eo.F0, eo.G0));
        }
        return (no<I>)new ActivityResultRegistry$b(this, s, (jo)jo);
    }
    
    public final <I, O> no<I> e(final String s, final tbf tbf, final jo<I, O> jo, final io<O> io) {
        final f u1 = ((Fragment)tbf).u1;
        if (!u1.b.b(d$c.I0)) {
            this.f(s);
            d d;
            if ((d = this.d.get(s)) == null) {
                d = new d((androidx.lifecycle.d)u1);
            }
            final ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, s, (io)io, (jo)jo);
            d.a.a((sbf)activityResultRegistry$1);
            d.b.add((e)activityResultRegistry$1);
            this.d.put(s, d);
            return (no<I>)new ActivityResultRegistry$a(this, s, (jo)jo);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("LifecycleOwner ");
        sb.append(tbf);
        sb.append(" is attempting to register while current state is ");
        sb.append(u1.b);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final void f(final String s) {
        if (this.c.get(s) != null) {
            return;
        }
        int n = this.a.nextInt(2147418112);
        int n2;
        while (true) {
            n2 = n + 65536;
            if (!this.b.containsKey(n2)) {
                break;
            }
            n = this.a.nextInt(2147418112);
        }
        this.a(n2, s);
    }
    
    public final void g(final String s) {
        if (!this.e.contains(s)) {
            final Integer n = this.c.remove(s);
            if (n != null) {
                this.b.remove(n);
            }
        }
        this.f.remove(s);
        if (this.g.containsKey(s)) {
            final StringBuilder b = po.B("Dropping pending result for request ", s, ": ");
            b.append(this.g.get(s));
            Log.w("ActivityResultRegistry", b.toString());
            this.g.remove(s);
        }
        if (((BaseBundle)this.h).containsKey(s)) {
            final StringBuilder b2 = po.B("Dropping pending result for request ", s, ": ");
            b2.append(this.h.getParcelable(s));
            Log.w("ActivityResultRegistry", b2.toString());
            this.h.remove(s);
        }
        final d d = this.d.get(s);
        if (d != null) {
            final Iterator<e> iterator = d.b.iterator();
            while (iterator.hasNext()) {
                d.a.c((sbf)iterator.next());
            }
            d.b.clear();
            this.d.remove(s);
        }
    }
    
    public static final class c<O>
    {
        public final io<O> a;
        public final jo<?, O> b;
        
        public c(final io<O> a, final jo<?, O> b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class d
    {
        public final androidx.lifecycle.d a;
        public final ArrayList<e> b;
        
        public d(final androidx.lifecycle.d a) {
            this.a = a;
            this.b = new ArrayList<e>();
        }
    }
}
