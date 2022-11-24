import android.os.BaseBundle;
import android.os.RemoteException;
import android.os.Parcelable$Creator;
import java.util.List;
import android.os.Bundle;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class k000 extends eoz implements u000
{
    public k000() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }
    
    public final boolean s(int n, final Parcel parcel) throws RemoteException {
        switch (n) {
            default: {
                return false;
            }
            case 15: {
                final Parcelable$Creator creator = Bundle.CREATOR;
                final Bundle bundle = (Bundle)arz.a(parcel);
                final ley ley = (ley)this;
                ley.b.d.c(ley.a);
                shy.g.l("onCancelDownloads()", new Object[0]);
                break;
            }
            case 14: {
                final Parcelable$Creator creator2 = Bundle.CREATOR;
                final Bundle bundle2 = (Bundle)arz.a(parcel);
                final Bundle bundle3 = (Bundle)arz.a(parcel);
                final ley ley2 = (ley)this;
                ley2.b.d.c(ley2.a);
                shy.g.l("onRemoveModule()", new Object[0]);
                break;
            }
            case 13: {
                final Parcelable$Creator creator3 = Bundle.CREATOR;
                final Bundle bundle4 = (Bundle)arz.a(parcel);
                final Bundle bundle5 = (Bundle)arz.a(parcel);
                final ley ley3 = (ley)this;
                ley3.b.d.c(ley3.a);
                shy.g.l("onRequestDownloadInfo()", new Object[0]);
                break;
            }
            case 12: {
                final Parcelable$Creator creator4 = Bundle.CREATOR;
                ((u000)this).W0((Bundle)arz.a(parcel), (Bundle)arz.a(parcel));
                break;
            }
            case 11: {
                final Parcelable$Creator creator5 = Bundle.CREATOR;
                ((u000)this).J0((Bundle)arz.a(parcel), (Bundle)arz.a(parcel));
                break;
            }
            case 10: {
                final Parcelable$Creator creator6 = Bundle.CREATOR;
                final Bundle bundle6 = (Bundle)arz.a(parcel);
                final Bundle bundle7 = (Bundle)arz.a(parcel);
                final ley ley4 = (ley)this;
                ley4.b.d.c(ley4.a);
                shy.g.l("onNotifySessionFailed(%d)", ((BaseBundle)bundle6).getInt("session_id"));
                break;
            }
            case 8: {
                final Parcelable$Creator creator7 = Bundle.CREATOR;
                final Bundle bundle8 = (Bundle)arz.a(parcel);
                final Bundle bundle9 = (Bundle)arz.a(parcel);
                final ley ley5 = (ley)this;
                ley5.b.d.c(ley5.a);
                shy.g.l("onNotifyModuleCompleted(%s, sessionId=%d)", ((BaseBundle)bundle8).getString("module_name"), ((BaseBundle)bundle8).getInt("session_id"));
                break;
            }
            case 7: {
                final Parcelable$Creator creator8 = Bundle.CREATOR;
                ((u000)this).m((Bundle)arz.a(parcel));
                break;
            }
            case 6: {
                final Parcelable$Creator creator9 = Bundle.CREATOR;
                final Bundle bundle10 = (Bundle)arz.a(parcel);
                final Bundle bundle11 = (Bundle)arz.a(parcel);
                final ley ley6 = (ley)this;
                ley6.b.d.c(ley6.a);
                shy.g.l("onNotifyChunkTransferred(%s, %s, %d, session=%d)", ((BaseBundle)bundle10).getString("module_name"), ((BaseBundle)bundle10).getString("slice_id"), ((BaseBundle)bundle10).getInt("chunk_number"), ((BaseBundle)bundle10).getInt("session_id"));
                break;
            }
            case 5: {
                ((u000)this).G((List)parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            }
            case 4: {
                n = parcel.readInt();
                final Parcelable$Creator creator10 = Bundle.CREATOR;
                final Bundle bundle12 = (Bundle)arz.a(parcel);
                final ley ley7 = (ley)this;
                ley7.b.d.c(ley7.a);
                shy.g.l("onGetSession(%d)", n);
                break;
            }
            case 3: {
                n = parcel.readInt();
                final Parcelable$Creator creator11 = Bundle.CREATOR;
                final Bundle bundle13 = (Bundle)arz.a(parcel);
                final ley ley8 = (ley)this;
                ley8.b.d.c(ley8.a);
                shy.g.l("onCancelDownload(%d)", n);
                break;
            }
            case 2: {
                n = parcel.readInt();
                final Parcelable$Creator creator12 = Bundle.CREATOR;
                final Bundle bundle14 = (Bundle)arz.a(parcel);
                final ley ley9 = (ley)this;
                ley9.b.d.c(ley9.a);
                shy.g.l("onStartDownload(%d)", n);
                break;
            }
        }
        return true;
    }
}
