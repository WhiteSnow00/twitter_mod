import java.util.Objects;
import java.io.IOException;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aa9
{
    public static final nmp<aa9> d;
    public final UserIdentifier a;
    public final String b;
    public final String c;
    
    static {
        aa9.d = new b();
    }
    
    public aa9(final a a) {
        final UserIdentifier a2 = a.a;
        vmw.g((Object)a2);
        this.a = a2;
        this.c = a.c;
        final String b = a.b;
        vmw.g((Object)b);
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && aa9.class == o.getClass()) {
            final aa9 aa9 = (aa9)o;
            if (!o5j.a((Object)this.a, (Object)aa9.a) || !o5j.a((Object)this.b, (Object)aa9.b) || !o5j.a((Object)this.c, (Object)aa9.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    public static final class a extends z4j<aa9>
    {
        public UserIdentifier a;
        public String b;
        public String c;
        
        public final Object i() {
            return new aa9(this);
        }
        
        public final boolean k() {
            return this.a != null && flr.g((CharSequence)this.b);
        }
    }
    
    public static final class b extends ss2<aa9, a>
    {
        public b() {
            super(2);
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            final aa9 aa9 = (aa9)o;
            smp.C((Object)aa9.a, UserIdentifier.BOXED_SERIALIZER);
            smp.G(aa9.b);
            smp.G(aa9.c);
        }
        
        public final z4j g() {
            return new a();
        }
        
        public final void h(final rmp rmp, final z4j z4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)z4j;
            final nmp boxed_SERIALIZER = UserIdentifier.BOXED_SERIALIZER;
            Objects.requireNonNull(rmp);
            a.a = (UserIdentifier)boxed_SERIALIZER.a(rmp);
            if (n < 2) {
                rmp.u();
            }
            if (n < 1) {
                rmp.A();
            }
            a.b = rmp.I();
            if (n < 2) {
                final rx6$o h = rx6.h;
                gmp.d(rmp);
                rmp.A();
            }
            a.c = rmp.I();
        }
    }
}
