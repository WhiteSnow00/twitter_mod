// 
// Decompiled by Procyon v0.6.0
// 

public final class w18 extends dat
{
    public w18(final String s, final x9h x9h) {
        super("dm:send_", (w9h$b)w9h.j, cjg.m("DMSendMetric", s), x9h);
    }
    
    public static w18 A(final String s, final cah cah) {
        cjg cjg;
        if ((cjg = cah.b(cjg.m("DMSendMetric", s))) == null) {
            cjg = cah.f((cjg)new w18(s, (x9h)cah));
        }
        return (w18)cjg;
    }
}
