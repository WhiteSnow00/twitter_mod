import android.os.BaseBundle;
import com.twitter.util.user.UserIdentifier;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class am1 implements eob
{
    public static final am1 b;
    public final Bundle a;
    
    static {
        b = new am1(Bundle.EMPTY);
    }
    
    public am1(Bundle a) {
        if (a == null) {
            a = new Bundle();
        }
        this.a = a;
    }
    
    @Deprecated
    public final Bundle a() {
        return this.a;
    }
    
    public final boolean b(final String s) {
        return this.a.getBoolean(s, false);
    }
    
    public final byte[] c(final String s) {
        return this.a.getByteArray(s);
    }
    
    public final int d(final String s) {
        return ((BaseBundle)this.a).getInt(s);
    }
    
    public final UserIdentifier e() {
        return swj.j(this.a, "BaseFragmentArgs_owner_id");
    }
    
    public final <S> S f(final String s, final nmp<S> nmp) {
        return (S)swj.f(this.a, s, (nmp)nmp);
    }
    
    public final String g(final String s) {
        return ((BaseBundle)this.a).getString(s);
    }
    
    public a h() {
        return (a)new am1.am1$b(this);
    }
    
    public abstract static class a<T extends am1, B extends a> extends z4j<T>
    {
        public final Bundle a;
        
        public a() {
            this.a = new Bundle();
        }
        
        public a(final Bundle bundle) {
            Bundle a;
            if (bundle != null) {
                a = new Bundle(bundle);
            }
            else {
                a = new Bundle();
            }
            this.a = a;
        }
        
        public final B o(final String s, final boolean b) {
            this.a.putBoolean(s, b);
            final int a = o5j.a;
            return (B)this;
        }
        
        public final B p(final String s, final byte[] array) {
            this.a.putByteArray(s, array);
            final int a = o5j.a;
            return (B)this;
        }
        
        public final B q(final String s, int a) {
            ((BaseBundle)this.a).putInt(s, a);
            a = o5j.a;
            return (B)this;
        }
        
        public final B r(final String s, final long n) {
            ((BaseBundle)this.a).putLong(s, n);
            final int a = o5j.a;
            return (B)this;
        }
        
        public final <U> B s(final String s, final U u, final nmp<U> nmp) {
            swj.k(this.a, s, (Object)u, (nmp)nmp);
            final int a = o5j.a;
            return (B)this;
        }
        
        public final B t(final String s, final String s2) {
            ((BaseBundle)this.a).putString(s, s2);
            final int a = o5j.a;
            return (B)this;
        }
        
        public final B u(final UserIdentifier userIdentifier) {
            ((BaseBundle)this.a).putLong("BaseFragmentArgs_owner_id", userIdentifier.getId());
            final int a = o5j.a;
            return (B)this;
        }
    }
}
