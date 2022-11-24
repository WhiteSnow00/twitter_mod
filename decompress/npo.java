import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class npo implements pml
{
    public final pml<si4> F0;
    public final pml<si4> G0;
    public final pml<hea> H0;
    public final pml<wxo> I0;
    public final pml<String> J0;
    
    public npo(final pml<si4> i0, final pml<si4> j0, final pml<hea> pml, final pml<wxo> pml2, final pml<String> pml3) {
        final ers a = ers$a.a;
        final frs a2 = frs$a.a;
        final kea a3 = kea$a.a;
        this.F0 = (pml<si4>)a;
        this.G0 = (pml<si4>)a2;
        this.H0 = (pml<hea>)a3;
        this.I0 = (pml<wxo>)i0;
        this.J0 = (pml<String>)j0;
    }
    
    public final Object get() {
        final si4 si4 = (si4)this.F0.get();
        final si4 si5 = (si4)this.G0.get();
        final Object value = this.H0.get();
        final Object value2 = this.I0.get();
        final pml<String> j0 = this.J0;
        final Object h0 = b89.H0;
        Object o;
        if (j0 instanceof oxe) {
            o = j0;
        }
        else {
            Objects.requireNonNull(j0);
            o = new b89((pml<Object>)j0);
        }
        return new mpo(si4, si5, (hea)value, (wxo)value2, (oxe)o);
    }
}
