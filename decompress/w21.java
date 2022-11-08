import java.util.Objects;
import com.twitter.rooms.model.RaisedHand;
import com.twitter.rooms.model.AudioSpaceCommunityRoleType;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w21
{
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final rhw e;
    public final AudioSpaceCommunityRoleType f;
    public final boolean g;
    public final RaisedHand h;
    
    public w21(final String a, final boolean b, final boolean c, final String d, final rhw e, final AudioSpaceCommunityRoleType f) {
        zzd.f((Object)a, "periscopeUserId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        final hfv e2 = this.e();
        this.g = (e2 != null && tdy.e0(e2.H1));
        this.h = new RaisedHand(d);
    }
    
    public static w21 a(final w21 w21, final rhw rhw) {
        final String a = w21.a;
        final boolean b = w21.b;
        final boolean c = w21.c;
        final String d = w21.d;
        final AudioSpaceCommunityRoleType f = w21.f;
        Objects.requireNonNull(w21);
        zzd.f((Object)a, "periscopeUserId");
        return new w21(a, b, c, d, rhw, f);
    }
    
    public final String b() {
        final hfv e = this.e();
        String d0;
        if (e != null) {
            d0 = e.D0;
        }
        else {
            d0 = null;
        }
        String s = d0;
        if (d0 == null) {
            s = "";
        }
        return s;
    }
    
    public final String c() {
        final hfv e = this.e();
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
        final hfv e = this.e();
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
    
    public final hfv e() {
        return ffa.e(this.e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w21)) {
            return false;
        }
        final w21 w21 = (w21)o;
        return zzd.a((Object)this.a, (Object)w21.a) && this.b == w21.b && this.c == w21.c && zzd.a((Object)this.d, (Object)w21.d) && zzd.a((Object)this.e, (Object)w21.e) && zzd.a((Object)this.f, (Object)w21.f);
    }
    
    public final String f() {
        final hfv e = this.e();
        String j0;
        if (e != null) {
            j0 = e.J0;
        }
        else {
            j0 = null;
        }
        String s = j0;
        if (j0 == null) {
            s = "";
        }
        return s;
    }
    
    public final boolean g() {
        final hfv e = this.e();
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
        final hfv e = this.e();
        return e != null && e.M0;
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
        final rhw e = this.e;
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
        final rhw e = this.e;
        final AudioSpaceCommunityRoleType f = this.f;
        final StringBuilder y = rb0.y("AudioSpaceParticipant(periscopeUserId=", a, ", mutedByAdmin=", b, ", mutedByGuest=");
        lf.z(y, c, ", raiseHandEmoji=", d, ", userResult=");
        y.append(e);
        y.append(", communityRole=");
        y.append(f);
        y.append(")");
        return y.toString();
    }
}
