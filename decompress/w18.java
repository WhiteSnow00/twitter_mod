import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.ArrayList;
import androidx.lifecycle.d;
import androidx.fragment.app.p;
import java.util.List;
import androidx.viewpager2.adapter.FragmentStateAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w18 extends FragmentStateAdapter
{
    public final bpb Q0;
    public final List<u28> R0;
    
    public w18(final dob dob, final p p5, final bpb q0, final kcm kcm, final boolean b) {
        e0e.f((Object)q0, "fragmentProvider");
        e0e.f((Object)kcm, "releaseCompletable");
        super(p5, (d)dob.I0);
        this.Q0 = q0;
        final u28 f0 = u28.F0;
        final u28 g0 = u28.G0;
        final u28 h0 = u28.H0;
        u28 i0 = u28.I0;
        if (!b) {
            i0 = null;
        }
        final ArrayList<u28> r0 = new ArrayList<u28>();
        ft0.W0((Object[])new u28[] { f0, g0, h0, i0 }, (Collection)r0);
        this.R0 = r0;
        kcm.i((sj)new g00(new de6(), 2));
    }
    
    public final Fragment E(final int n) {
        return this.Q0.a((eob)new g08.a(this.R0.get(n)).e());
    }
    
    public final int c() {
        return this.R0.size();
    }
}
