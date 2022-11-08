import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dr6
{
    public static final a Companion;
    public final String a;
    public final String b;
    
    static {
        Companion = new a();
    }
    
    public dr6(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final tfe tfe) throws IOException {
        tfe.r0();
        tfe.u0("old", this.a);
        tfe.u0("new", this.b);
        tfe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dr6)) {
            return false;
        }
        final dr6 dr6 = (dr6)o;
        return zzd.a((Object)this.a, (Object)dr6.a) && zzd.a((Object)this.b, (Object)dr6.b);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return yqh.k("ConversationControlChangeDetails(oldConversationControlPolicy=", this.a, ", newConversationControlPolicy=", this.b, ")");
    }
    
    public static final class a
    {
    }
}
