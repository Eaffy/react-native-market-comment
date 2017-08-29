import {
  Linking,
  Platform,
  NativeModules
} from 'react-native';

const RNMarketCommentModule = NativeModules.RNMarketCommentModule;
export const APP_STORE_COMMENT = 'itms-apps://itunes.apple.com/WebObjects/MZStore.woa/wa/viewContentsUserReviews?type=Purple+Software&id=';

export default function openAppStoreToComment (appId = 1210643082) {
  if (Platform.OS === 'ios') {
    const url = APP_STORE_COMMENT + appId;
    Linking.openURL(url).catch(err => console.error('An error occurred', err));
    return;
  }
  if (Platform.OS === 'android') {
    RNMarketCommentModule.show();
  }
}
