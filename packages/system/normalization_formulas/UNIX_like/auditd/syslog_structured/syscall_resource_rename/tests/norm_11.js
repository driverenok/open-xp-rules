{
  "subject": "account",
  "action": "move",
  "object": "file_object",
  "status": "success",
  "category.generic": "File System Object",
  "category.high": "System Management",
  "category.low": "Manipulation",
  "chain_id": "27852553",
  "datafield1": "mv",
  "datafield2": "rbolgov",
  "datafield3": "0755",
  "event_src.category": "Operating system",
  "event_src.ip": "10.10.52.40",
  "event_src.rule": "pt_siem_home_modify",
  "event_src.subsys": "auditd",
  "event_src.title": "unix_like",
  "id": "PT_UNIX_like_auditd_syslog_structured_syscall_resource_rename",
  "importance": "low",
  "labels": "node_contains_ext_ip",
  "msgid": "renameat2",
  "numfield2": 1010,
  "object.account.group": "rbolgov",
  "object.account.id": "1010",
  "object.account.name": "rbolgov",
  "object.fullpath": "/home/rbolgov/.vscode-server/bin/b3e4e68a0bc097f0ae7907b217c1119af9e03435/vscode-server-linux-x64/bin",
  "object.id": "1255059",
  "object.name": "bin",
  "object.new_value": "/home/rbolgov/.vscode-server/bin/b3e4e68a0bc097f0ae7907b217c1119af9e03435/bin",
  "object.path": "/home/rbolgov/.vscode-server/bin/b3e4e68a0bc097f0ae7907b217c1119af9e03435/vscode-server-linux-x64/",
  "object.property": "fullpath",
  "object.type": "directory",
  "subject.account.id": "1010",
  "subject.account.name": "rbolgov",
  "subject.account.privileges": "1010",
  "subject.account.session_id": "2989",
  "subject.process.cwd": "/home/rbolgov/.vscode-server/bin/b3e4e68a0bc097f0ae7907b217c1119af9e03435",
  "subject.process.fullpath": "/usr/bin/mv",
  "subject.process.id": "3434244",
  "subject.process.meta": "mv vscode-server-linux-x64/bin vscode-server-linux-x64/extensions vscode-server-linux-x64/LICENSE vscode-server-linux-x64/node v",
  "subject.process.name": "mv",
  "subject.process.parent.id": "3434180",
  "subject.process.path": "/usr/bin/",
  "time": "2023-05-15T07:00:49.000Z"
}