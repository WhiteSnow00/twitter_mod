import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyz extends vby
{
    public final r4c E0;
    
    public iyz(final r4c e0) {
        super("internal.logger");
        this.E0 = e0;
        super.D0.put("log", new qxz(this, false, true));
        super.D0.put("silent", new puz());
        super.D0.get("silent").m("log", (aey)new qxz(this, true, true));
        super.D0.put("unmonitored", new ewz());
        super.D0.get("unmonitored").m("log", (aey)new qxz(this, false, false));
    }
    
    public final aey a(final k6z k6z, final List list) {
        return (aey)aey.u0;
    }
}
