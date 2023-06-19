/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.counted.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.counted.model.Counted;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Counted in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CountedCacheModel implements CacheModel<Counted>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CountedCacheModel)) {
			return false;
		}

		CountedCacheModel countedCacheModel = (CountedCacheModel)object;

		if (countedId == countedCacheModel.countedId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, countedId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", countedId=");
		sb.append(countedId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", telefone=");
		sb.append(telefone);
		sb.append(", idade=");
		sb.append(idade);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Counted toEntityModel() {
		CountedImpl countedImpl = new CountedImpl();

		if (uuid == null) {
			countedImpl.setUuid("");
		}
		else {
			countedImpl.setUuid(uuid);
		}

		countedImpl.setCountedId(countedId);
		countedImpl.setGroupId(groupId);
		countedImpl.setCompanyId(companyId);
		countedImpl.setUserId(userId);

		if (userName == null) {
			countedImpl.setUserName("");
		}
		else {
			countedImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			countedImpl.setCreateDate(null);
		}
		else {
			countedImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			countedImpl.setModifiedDate(null);
		}
		else {
			countedImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nome == null) {
			countedImpl.setNome("");
		}
		else {
			countedImpl.setNome(nome);
		}

		if (telefone == null) {
			countedImpl.setTelefone("");
		}
		else {
			countedImpl.setTelefone(telefone);
		}

		countedImpl.setIdade(idade);

		if (email == null) {
			countedImpl.setEmail("");
		}
		else {
			countedImpl.setEmail(email);
		}

		countedImpl.resetOriginalValues();

		return countedImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		countedId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nome = objectInput.readUTF();
		telefone = objectInput.readUTF();

		idade = objectInput.readInt();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(countedId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (nome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nome);
		}

		if (telefone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telefone);
		}

		objectOutput.writeInt(idade);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public String uuid;
	public long countedId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nome;
	public String telefone;
	public int idade;
	public String email;

}