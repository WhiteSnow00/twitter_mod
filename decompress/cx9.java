// 
// Decompiled by Procyon v0.6.0
// 

public final class cx9 extends huh<d7a> implements h7a
{
    public kju G0;
    
    public cx9() {
        this.G0 = kju.h;
    }
    
    public cx9(final jeu jeu) {
        super((xwm)jeu);
        this.G0 = jeu.H0;
    }
    
    public final CharSequence e() {
        return (CharSequence)super.F0;
    }
    
    public final int i(final d7a d7a) {
        final euh euh = super.D0.get(d7a);
        int b;
        if (euh != null) {
            b = euh.b;
        }
        else {
            b = -1;
        }
        return b;
    }
    
    public final kju j() {
        return this.G0;
    }
}
