// 
// Decompiled by Procyon v0.6.0
// 

public final class whv implements jiv
{
    public final aiv a;
    
    public whv(final aiv a) {
        this.a = a;
    }
    
    public final void a(final fiv fiv) {
        final int ordinal = fiv.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 5) {
                    this.a.g(13, "u2f_unenrollment_method_dialog");
                }
            }
            else {
                this.a.g(10, "totp_unenrollment_method_dialog");
            }
        }
        else {
            this.a.g(9, "sms_unenrollment_method_dialog");
        }
    }
}
