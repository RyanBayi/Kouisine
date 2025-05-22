// index.js
import { AppRegistry } from 'react-native';
import App from './App'; // ✅ importe le fichier qu'on vient de créer
import { name as appName } from './app.json';

AppRegistry.registerComponent(appName, () => App);

