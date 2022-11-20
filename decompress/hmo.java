import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmo
{
    public final String a;
    public final String[] b;
    
    public hmo(final String[] b) {
        this.a = "Abusive behavior that targets someone based on their identity isn\u2019t allowed, including:";
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!czd.a((Object)hmo.class, (Object)class1)) {
            return false;
        }
        czd.d(o, "null cannot be cast to non-null type com.twitter.safetycenter.reportdetail.RuleSummary");
        final hmo hmo = (hmo)o;
        return czd.a((Object)this.a, (Object)hmo.a) && Arrays.equals(this.b, hmo.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + Arrays.hashCode(this.b);
    }
    
    @Override
    public final String toString() {
        return zh8.o("RuleSummary(description=", this.a, ", examples=", Arrays.toString(this.b), ")");
    }
}
