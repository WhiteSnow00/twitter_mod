import java.util.Iterator;
import android.util.Log;
import androidx.fragment.app.p;
import androidx.fragment.app.Fragment;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yob extends t9x
{
    public static final yob$a i;
    public final HashMap<String, Fragment> c;
    public final HashMap<String, yob> d;
    public final HashMap<String, lax> e;
    public final boolean f;
    public boolean g;
    public boolean h;
    
    static {
        i = new gax$a() {
            public final <T extends t9x> T a(final Class<T> clazz) {
                return (T)new yob(true);
            }
            
            public final t9x b(final Class clazz, final f67 f67) {
                return this.a((Class<t9x>)clazz);
            }
        };
    }
    
    public yob(final boolean f) {
        this.c = new HashMap<String, Fragment>();
        this.d = new HashMap<String, yob>();
        this.e = new HashMap<String, lax>();
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
        if (this.c.containsKey(fragment.K0)) {
            return;
        }
        this.c.put(fragment.K0, fragment);
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
        this.d(fragment.K0);
    }
    
    public final void d(final String s) {
        final yob yob = this.d.get(s);
        if (yob != null) {
            yob.a();
            this.d.remove(s);
        }
        final lax lax = this.e.get(s);
        if (lax != null) {
            lax.a();
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
        if (this.c.remove(fragment.K0) != null && p.P(2)) {
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
        if (o != null && yob.class == o.getClass()) {
            final yob yob = (yob)o;
            if (!this.c.equals(yob.c) || !this.d.equals(yob.d) || !this.e.equals(yob.e)) {
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
