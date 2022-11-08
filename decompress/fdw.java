// 
// Decompiled by Procyon v0.6.0
// 

public final class fdw implements oax
{
    public final hig$c a;
    public final hqn b;
    public final boolean c;
    
    public fdw() {
        this(null, 7);
    }
    
    public fdw(hig$c a, final int n) {
        hqn c0 = null;
        if ((n & 0x1) != 0x0) {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            c0 = hqn.C0;
        }
        zzd.f((Object)c0, "roomType");
        this.a = a;
        this.b = c0;
        this.c = false;
    }
    
    public fdw(final hig$c a, final hqn b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fdw)) {
            return false;
        }
        final fdw fdw = (fdw)o;
        return zzd.a((Object)this.a, (Object)fdw.a) && this.b == fdw.b && this.c == fdw.c;
    }
    
    @Override
    public final int hashCode() {
        final hig$c a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int hashCode2 = this.b.hashCode();
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode2 + hashCode * 31) * 31 + c;
    }
    
    @Override
    public final String toString() {
        final hig$c a = this.a;
        final hqn b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserItemState(item=");
        sb.append(a);
        sb.append(", roomType=");
        sb.append(b);
        sb.append(", hasAdminPrivileges=");
        return bd.y(sb, c, ")");
    }
}
