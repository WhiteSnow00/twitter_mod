import java.util.Iterator;
import android.util.Log;
import androidx.fragment.app.p;
import androidx.fragment.app.Fragment;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpb extends h8x
{
    public static final bpb$a i;
    public final HashMap<String, Fragment> c;
    public final HashMap<String, bpb> d;
    public final HashMap<String, x8x> e;
    public final boolean f;
    public boolean g;
    public boolean h;
    
    static {
        i = new s8x$a() {
            public final <T extends h8x> T a(final Class<T> clazz) {
                return (T)new bpb(true);
            }
            
            public final h8x b(final Class clazz, final w57 w57) {
                return this.a((Class<h8x>)clazz);
            }
        };
    }
    
    public bpb(final boolean f) {
        this.c = new HashMap<String, Fragment>();
        this.d = new HashMap<String, bpb>();
        this.e = new HashMap<String, x8x>();
        this.g = false;
        this.h = false;
        this.f = f;
    }
    
    @Override
    public final void a() {
        if (p.P(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.g = true;
    }
    
    public final void b(final Fragment fragment) {
        if (this.h) {
            if (p.P(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.c.containsKey(fragment.H0)) {
            return;
        }
        this.c.put(fragment.H0, fragment);
        if (p.P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final void c(final Fragment fragment) {
        if (p.P(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
            Log.d("FragmentManager", sb.toString());
        }
        this.d(fragment.H0);
    }
    
    public final void d(final String s) {
        final bpb bpb = this.d.get(s);
        if (bpb != null) {
            bpb.a();
            this.d.remove(s);
        }
        final x8x x8x = this.e.get(s);
        if (x8x != null) {
            x8x.a();
            this.e.remove(s);
        }
    }
    
    public final void e(final Fragment fragment) {
        if (this.h) {
            if (p.P(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.c.remove(fragment.H0) != null && p.P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && bpb.class == o.getClass()) {
            final bpb bpb = (bpb)o;
            if (!this.c.equals(bpb.c) || !this.d.equals(bpb.d) || !this.e.equals(bpb.e)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + this.c.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        final Iterator<Fragment> iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        final Iterator<String> iterator2 = this.d.keySet().iterator();
        while (iterator2.hasNext()) {
            sb.append(iterator2.next());
            if (iterator2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        final Iterator<String> iterator3 = this.e.keySet().iterator();
        while (iterator3.hasNext()) {
            sb.append(iterator3.next());
            if (iterator3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
