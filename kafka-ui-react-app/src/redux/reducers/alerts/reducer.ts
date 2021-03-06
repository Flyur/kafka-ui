import { getType } from 'typesafe-actions';
import { dismissAlert } from 'redux/actions';
import { Action, AlertsState } from 'redux/interfaces';
import { addError, removeAlert } from './utils';

export const initialState: AlertsState = {};

const reducer = (state = initialState, action: Action): AlertsState => {
  const { type } = action;

  const matches = /(.*)__(FAILURE)$/.exec(type);
  if (matches && matches[2]) return addError(state, action);

  if (type === getType(dismissAlert)) {
    return removeAlert(state, action);
  }

  return state;
};

export default reducer;
