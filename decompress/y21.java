import java.util.Objects;
import com.twitter.rooms.model.RaisedHand;
import com.twitter.rooms.model.AudioSpaceCommunityRoleType;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y21
{
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final ziw e;
    public final AudioSpaceCommunityRoleType f;
    public final boolean g;
    public final RaisedHand h;
    
    public y21(final String a, final boolean b, final boolean c, final String d, final ziw e, final AudioSpaceCommunityRoleType f) {
        e0e.f((Object)a, "periscopeUserId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        final qgv e2 = this.e();
        this.g = (e2 != null && fbx.J(e2.K1));
        this.h = new RaisedHand(d);
    }
    
    public static y21 a(final y21 y21, final ziw ziw) {
        final String a = y21.a;
        final boolean b = y21.b;
        final boolean c = y21.c;
        final String d = y21.d;
        final AudioSpaceCommunityRoleType f = y21.f;
        Objects.requireNonNull(y21);
        e0e.f((Object)a, "periscopeUserId");
        return new y21(a, b, c, d, ziw, f);
    }
    
    public final String b() {
        final qgv e = this.e();
        String g0;
        if (e != null) {
            g0 = e.G0;
        }
        else {
            g0 = null;
        }
        String s = g0;
        if (g0 == null) {
            s = "";
        }
        return s;
    }
    
    public final String c() {
        final qgv e = this.e();
        String c;
        if (e != null) {
            c = e.c();
        }
        else {
            c = null;
        }
        String s = c;
        if (c == null) {
            s = "";
        }
        return s;
    }
    
    public final String d() {
        final qgv e = this.e();
        String e2;
        if (e != null) {
            e2 = e.e();
        }
        else {
            e2 = null;
        }
        String s = e2;
        if (e2 == null) {
            s = "";
        }
        return s;
    }
    
    public final qgv e() {
        return dvc.b(this.e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y21)) {
            return false;
        }
        final y21 y21 = (y21)o;
        return e0e.a((Object)this.a, (Object)y21.a) && this.b == y21.b && this.c == y21.c && e0e.a((Object)this.d, (Object)y21.d) && e0e.a((Object)this.e, (Object)y21.e) && e0e.a((Object)this.f, (Object)y21.f);
    }
    
    public final String f() {
        final qgv e = this.e();
        String m0;
        if (e != null) {
            m0 = e.M0;
        }
        else {
            m0 = null;
        }
        String s = m0;
        if (m0 == null) {
            s = "";
        }
        return s;
    }
    
    public final boolean g() {
        final qgv e = this.e();
        Boolean h;
        if (e != null) {
            h = e.h();
        }
        else {
            h = null;
        }
        return h != null && h;
    }
    
    public final boolean h() {
        final qgv e = this.e();
        return e != null && e.P0;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b ? 1 : 0;
        int n = 1;
        int n2 = b;
        if (b != 0) {
            n2 = 1;
        }
        final int c = this.c ? 1 : 0;
        if (c == 0) {
            n = c;
        }
        final String d = this.d;
        int hashCode2 = 0;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final ziw e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final AudioSpaceCommunityRoleType f = this.f;
        if (f != null) {
            hashCode2 = f.hashCode();
        }
        return ((((hashCode * 31 + n2) * 31 + n) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final String d = this.d;
        final ziw e = this.e;
        final AudioSpaceCommunityRoleType f = this.f;
        final StringBuilder h = fd.H("AudioSpaceParticipant(periscopeUserId=", a, ", mutedByAdmin=", b, ", mutedByGuest=");
        rh.y(h, c, ", raiseHandEmoji=", d, ", userResult=");
        h.append(e);
        h.append(", communityRole=");
        h.append(f);
        h.append(")");
        return h.toString();
    }
}
