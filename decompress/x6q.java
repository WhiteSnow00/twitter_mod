import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x6q
{
    public final Set<String> a;
    public final cbw b;
    public z7q c;
    
    public x6q(final cbw b) {
        this.a = (muh$a)muh.a(0);
        this.c = z7q.E0;
        this.b = b;
    }
    
    public final String a(final int n) {
        if (n == 1) {
            return "name";
        }
        if (n != 2) {
            if (n == 3) {
                return "birthday";
            }
            throw new IllegalArgumentException(udu.z("Got invalid field type: ", n));
        }
        else {
            final z7q c = this.c;
            if (c == z7q.F0) {
                return "email";
            }
            if (c == z7q.E0) {
                return "phone_number";
            }
            return "phone_number_and_email";
        }
    }
    
    public final void b(final int n) {
        final String a = this.a(n);
        if (!((HashSet)this.a).contains(a)) {
            ((HashSet<String>)this.a).add(a);
            this.b.c((elm)new af4(vba.d((baa)saa.i, a, "edited")));
        }
    }
}
