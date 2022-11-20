import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uj7
{
    public final String a;
    public final List<a> b;
    public final boolean c;
    
    public uj7(final String a, final List<a> b) {
        czd.f((Object)a, "conversationId");
        this.a = a;
        this.b = b;
        final boolean empty = b.isEmpty();
        final boolean b2 = false;
        boolean c = false;
        Label_0095: {
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
                    break Label_0095;
                } while (((a)iterator.next()).a != ok7.D0);
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
        if (!(o instanceof uj7)) {
            return false;
        }
        final uj7 uj7 = (uj7)o;
        return czd.a((Object)this.a, (Object)uj7.a) && czd.a((Object)this.b, (Object)uj7.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return ta0.y("DMConversationLabel(conversationId=", this.a, ", labelInfos=", (List)this.b, ")");
    }
    
    public static final class a
    {
        public final ok7 a;
        public final long b;
        
        public a(final ok7 a, final long b) {
            czd.f((Object)a, "labelType");
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
            final ok7 a = this.a;
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
