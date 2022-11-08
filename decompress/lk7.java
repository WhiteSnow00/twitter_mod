import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lk7
{
    public final String a;
    public final List<a> b;
    public final boolean c;
    
    public lk7(final String a, final List<a> b) {
        zzd.f((Object)a, "conversationId");
        this.a = a;
        this.b = b;
        final boolean empty = b.isEmpty();
        final boolean b2 = false;
        boolean c = false;
        Label_0093: {
            if (empty) {
                c = b2;
            }
            else {
                final Iterator iterator = b.iterator();
                do {
                    c = b2;
                    if (iterator.hasNext()) {
                        continue;
                    }
                    break Label_0093;
                } while (((a)iterator.next()).a != hl7.C0);
                c = true;
            }
        }
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lk7)) {
            return false;
        }
        final lk7 lk7 = (lk7)o;
        return zzd.a((Object)this.a, (Object)lk7.a) && zzd.a((Object)this.b, (Object)lk7.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return bl0.z("DMConversationLabel(conversationId=", this.a, ", labelInfos=", (List)this.b, ")");
    }
    
    public static final class a
    {
        public final hl7 a;
        public final long b;
        
        public a(final hl7 a, final long b) {
            zzd.f((Object)a, "labelType");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final long b = this.b;
            return hashCode * 31 + (int)(b ^ b >>> 32);
        }
        
        @Override
        public final String toString() {
            final hl7 a = this.a;
            final long b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Info(labelType=");
            sb.append(a);
            sb.append(", createdAt=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
