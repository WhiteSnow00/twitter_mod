import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vg6 extends rd
{
    public static final Parcelable$Creator<vg6> CREATOR;
    public static final vg6 H0;
    public final int D0;
    public final int E0;
    public final PendingIntent F0;
    public final String G0;
    
    static {
        H0 = new vg6(0, null, null);
        CREATOR = (Parcelable$Creator)new qiy();
    }
    
    public vg6(final int d0, final int e0, final PendingIntent f0, final String g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public vg6(final int e0, final PendingIntent f0, final String g0) {
        this.D0 = 1;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public static String t(final int n) {
        if (n == 99) {
            return "UNFINISHED";
        }
        if (n == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        final StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(n);
                        sb.append(")");
                        return sb.toString();
                    }
                    case 24: {
                        return "API_DISABLED_FOR_CONNECTION";
                    }
                    case 23: {
                        return "API_DISABLED";
                    }
                    case 22: {
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    }
                    case 21: {
                        return "API_VERSION_UPDATE_REQUIRED";
                    }
                    case 20: {
                        return "RESTRICTED_PROFILE";
                    }
                    case 19: {
                        return "SERVICE_MISSING_PERMISSION";
                    }
                    case 18: {
                        return "SERVICE_UPDATING";
                    }
                    case 17: {
                        return "SIGN_IN_FAILED";
                    }
                    case 16: {
                        return "API_UNAVAILABLE";
                    }
                    case 15: {
                        return "INTERRUPTED";
                    }
                    case 14: {
                        return "TIMEOUT";
                    }
                    case 13: {
                        return "CANCELED";
                    }
                }
                break;
            }
            case 11: {
                return "LICENSE_CHECK_FAILED";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 9: {
                return "SERVICE_INVALID";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 1: {
                return "SERVICE_MISSING";
            }
            case 0: {
                return "SUCCESS";
            }
            case -1: {
                return "UNKNOWN";
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof vg6)) {
            return false;
        }
        final vg6 vg6 = (vg6)o;
        return this.E0 == vg6.E0 && f5j.a(this.F0, vg6.F0) && f5j.a(this.G0, vg6.G0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.E0, this.F0, this.G0 });
    }
    
    public final boolean r() {
        return this.E0 != 0 && this.F0 != null;
    }
    
    public final boolean s() {
        return this.E0 == 0;
    }
    
    @Override
    public final String toString() {
        final f5j.a a = new f5j.a(this);
        a.a("statusCode", t(this.E0));
        a.a("resolution", this.F0);
        a.a("message", this.G0);
        return a.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.T0(parcel, 1, this.D0);
        fli.T0(parcel, 2, this.E0);
        fli.X0(parcel, 3, (Parcelable)this.F0, n);
        fli.Y0(parcel, 4, this.G0);
        fli.g1(parcel, d1);
    }
}
