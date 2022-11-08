// 
// Decompiled by Procyon v0.6.0
// 

public interface gvv<T>
{
    T b(final u4c p0, final frm p1);
    
    public static final class a
    {
        public static <H, UH extends gvv<H>> H a(final UH uh, final u4c u4c, final frm frm) {
            if (uh == null) {
                return null;
            }
            return uh.b(u4c, frm);
        }
    }
}
