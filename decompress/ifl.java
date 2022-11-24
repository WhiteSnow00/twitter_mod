import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.twitter.app.profiles.ProfileActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifl extends xdu
{
    public final und d0;
    
    public ifl(final und d0, final ydu ydu, final thm thm, final swh swh, final iwp iwp, final hcf hcf, final sfv sfv, final vvs vvs, final k4f k4f, final evm evm, final ii7<hp6> ii7, final dsb dsb, final mxe<es6> mxe, final d5q d5q, final vtt vtt, final t42 t42, final kcm kcm, final xfw xfw, final ocj<vcu> ocj, final fci<?> fci, final qvu qvu, final ewu ewu, final quv quv, final wtv wtv, final yfu yfu, final l5b l5b, final ysq ysq, final evm evm2, final oe5 oe5, final wh5 wh5, final gra<iuu, String> gra, final us5 us5, final rau rau, final nlq nlq, final zv1 zv1, final eh5 eh5, final p6o p6o) {
        super(d0, ydu, thm, swh, iwp, hcf, sfv, vvs, (cwh)null, k4f, (sjh)null, (ii7)ii7, (xjh)null, dsb, (mxe)mxe, d5q, evm, vtt, t42, kcm, xfw, (ocj)ocj, (dda)null, (fci)fci, qvu, ewu, quv, wtv, yfu, (fda)new hfl(d0), l5b, ysq, oe5, wh5, evm2, (gra)gra, us5, rau, nlq, (o5c)null, zv1, eh5, p6o);
        this.d0 = d0;
    }
    
    public final void n(final ddu ddu, final hp6 hp6, final ufv ufv, final edu edu, final boolean b, final vxs vxs, final uvp uvp, final kmu kmu, final n0j n0j, final bhu bhu, final cdu cdu) {
        super.n(ddu, hp6, ufv, edu, b, vxs, uvp, kmu, n0j, bhu, cdu);
        if (((Fragment)this.d0).L0() instanceof ProfileActivity) {
            final int ordinal = ddu.ordinal();
            if (ordinal != 6 && ordinal != 7 && ordinal != 8) {
                switch (ordinal) {
                    default: {
                        return;
                    }
                    case 15:
                    case 16:
                    case 17:
                    case 18: {
                        break;
                    }
                }
            }
            final ifl.ifl$a ifl$a = (ifl.ifl$a)tqb.A((Activity)((Fragment)this.d0).L0(), ifl.ifl$a.class);
            if (ifl$a != null) {
                ifl$a.S(true);
            }
        }
    }
}
