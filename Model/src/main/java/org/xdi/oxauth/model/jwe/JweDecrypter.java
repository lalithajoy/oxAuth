/*
 * oxAuth is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */

package org.xdi.oxauth.model.jwe;

import org.xdi.oxauth.model.crypto.encryption.BlockEncryptionAlgorithm;
import org.xdi.oxauth.model.crypto.encryption.KeyEncryptionAlgorithm;
import org.xdi.oxauth.model.exception.InvalidJweException;

/**
 * @author Javier Rojas Blum Date: 12.04.2012
 */
public interface JweDecrypter {

    public KeyEncryptionAlgorithm getKeyEncryptionAlgorithm();

    public void setKeyEncryptionAlgorithm(KeyEncryptionAlgorithm keyEncryptionAlgorithm);

    public BlockEncryptionAlgorithm getBlockEncryptionAlgorithm();

    public void setBlockEncryptionAlgorithm(BlockEncryptionAlgorithm blockEncryptionAlgorithm);

    public Jwe decrypt(String encryptedJwe) throws InvalidJweException;
}